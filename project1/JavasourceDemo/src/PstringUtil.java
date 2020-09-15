//一个工具类，全部为方法，判断合法性


/**
 * 判断用户名输入是否合法
 * @param userName
 * @return
 */
public class PstringUtil {
	public static boolean isCorUserN(String userName) {
		boolean isCor = true;
		if(userName == null) return false;
		if(userName.length() > 25) return false;
		//char中包含了所有不合法的字符
		char[] invalidC = {' ','\'','"','?','<','>',','};
		for (char ch : invalidC) {
			if(userName.contains(Character.toString(ch))) {
				isCor = false;
				break;
			}		
		}
		return isCor; 
	}
	/**
	 * 密码6-18位，只能包含数字、字母、特殊符号
	 * 纯数字、字母 密码强度位弱 二星
	 * 两种组合：密码强度位中四星
	 * 三种字符都有：强 六星
	 * 
	 * @param password
	 * @return 返回“”说明验证失败，返回星号表示密码强度
	 */
	public static String validPassword(String password) {
		String power = "invalid length"; //密码的强度
		if(password == null) return power;
		if(password.length() < 6 || password.length()>18) return power;
		//String[] correctPart = {"_","@","#","$","!"};
		String part = "_@#$!";
		for(int i = 0; i < password.length(); i++) {
			//如果不是字母或者数字+也不是一个特殊符号
			if(!Character.isLetterOrDigit(password.charAt(i))) {
				if(!part.contains(Character.toString(password.charAt(i)))) {
					return power;
				}
			}
		}
		//判断密码强度
		if(isDigit(password) || isLetter(password)) {
			power = "**----";
		}
		else if (isDAndL(password)) {
			power = "****--";
		}
		else if (ifSymbol(password)) {
			power = "******";
		}
		
		
		return power;
	}
	/**
	 * 是否是纯数字
	 * @param value
	 * @return
	 */
	public static boolean isDigit(String value) {
		for(int i = 0; i < value.length();i++) {
			if(!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 是否是纯字母
	 * @param value
	 * @return
	 */
	public static boolean isLetter(String value) {
		for(int i = 0; i < value.length();i++) {
			if(!Character.isLetter(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 是否包含特殊符号
	 * @param value
	 * @return
	 */
	public static boolean ifSymbol(String value) {
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(part.contains(Character.toString(value.charAt(i)))) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 是否包含字母或数字
	 * @param value
	 * @return
	 */
	private static boolean isDAndL(String value) {
		for(int i = 0; i<value.length(); i++) {
			if(!(Character.isLetterOrDigit(value.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
	
	
}