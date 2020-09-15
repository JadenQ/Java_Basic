import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class String_Demo {
	
	/**
	 * 传入的字符串是否是一个正确格式的小数
	 * @param str
	 * @return boolean 
	 */
	public static boolean isDecimal(String str) {
		//1.判断字符串中的每一个元素都是数字或者小数点
		//2.小数点不在第一位或者最后一位
		boolean flag = true;
		for(int i = 0; i< str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) {
				if(str.charAt(i)=='.') {
					if(i == 0 || i == str.length()-1) {
						flag = false;
						break;
					}
				}
				else {
					flag = false;
						break;}
			}
		}
		//判断字符串中只有一个小数点
		//1.存在小数点2.从前往后、从后往前的搜索下标相等
		if(!(str.contains(".")&&str.indexOf(".") == str.lastIndexOf("."))) {
			return false;
		}
		//if(str.indexOf('.') == 0 || str.indexOf(".") == str.length()-1)
		
		return flag;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO 演示几种String对象的构造方法
		String str1 = "你好，世界";
		String str2 = new String(); //使用默认的构造
		String str3 = "";  //str2和str3构造方法相同，但地址不同
		String str4 = new String(str1); //将原始的值和地址都复制进来
		
		//C语言中，字符串最后一个元素是\0，
		//字符数组to字符串
		char[] chArray = {'a','b','c'}; 
		String str5 = new String(chArray);
		System.out.println(str4);
		
		//字符串to字符数组
		chArray = str4.toCharArray();
		
		//字节数组 与 字符串额转换 
		//byte 数据类型_ -128 To 127 对应ASIIC
		byte[] byteArray = {104,101,108,108,111};
		String str6 = new String(byteArray);
		System.out.println(str6);
		
		//字符串转码
		String str7 = new String(str1.getBytes(),"UTF-8");
		System.out.println(str7);
		
		//trim方法：去掉字符串左右两侧的空格
		//为了更好的用户体验，在用户输入用户名之后使用
		Scanner input = new Scanner(System.in);
		System.out.println("input ur name:");
		//区分next还是nextLine
		String uName = input.nextLine().trim();
		System.out.println("--"+uName+"--");
		
		//concat方法
		String a = "abc";
		String b = "234";
		String c = a + b;
		//c没有用concat，使用了string buffer
		
		//compare to
		System.out.println("abc".equals("abc"));
		//逐位比较asiic码，前-后 返回小于0，0，大于0可选择 IgnoreCase
		System.out.println("abcf".compareTo("abcd"));
		
		//startswith方法
		System.out.println("abc".startsWith("ab"));
		System.out.println("abcse".endsWith("se"));
		System.out.println("aafeeg".contains("fee"));
		
		//indexOf方法：返回下标
		String password = "1243412nsadf";
		System.out.println(password.contains("434"));
			//indexOf可以传入：字符，字符串
		System.out.println(password.indexOf('3'));
		System.out.println(password.indexOf("nsa"));
			//从第二个开始往后找“12”，返回下标
		System.out.println(password.indexOf("12",2));
			//没查到的返回-1
		System.out.println(password.indexOf("adsf"));
		
		//判断字符串中只能有一个小数点
		//isDecimal方法
		
		//substring方法
		//截取的范围：[begin,end)左闭右开  or 从第3个之后所有的
		System.out.println(password.substring(1,5));
		System.out.println(password.substring(3));
		
		
		
		
	}

}
