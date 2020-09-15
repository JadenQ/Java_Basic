import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class String_Demo {
	
	/**
	 * ������ַ����Ƿ���һ����ȷ��ʽ��С��
	 * @param str
	 * @return boolean 
	 */
	public static boolean isDecimal(String str) {
		//1.�ж��ַ����е�ÿһ��Ԫ�ض������ֻ���С����
		//2.С���㲻�ڵ�һλ�������һλ
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
		//�ж��ַ�����ֻ��һ��С����
		//1.����С����2.��ǰ���󡢴Ӻ���ǰ�������±����
		if(!(str.contains(".")&&str.indexOf(".") == str.lastIndexOf("."))) {
			return false;
		}
		//if(str.indexOf('.') == 0 || str.indexOf(".") == str.length()-1)
		
		return flag;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO ��ʾ����String����Ĺ��췽��
		String str1 = "��ã�����";
		String str2 = new String(); //ʹ��Ĭ�ϵĹ���
		String str3 = "";  //str2��str3���췽����ͬ������ַ��ͬ
		String str4 = new String(str1); //��ԭʼ��ֵ�͵�ַ�����ƽ���
		
		//C�����У��ַ������һ��Ԫ����\0��
		//�ַ�����to�ַ���
		char[] chArray = {'a','b','c'}; 
		String str5 = new String(chArray);
		System.out.println(str4);
		
		//�ַ���to�ַ�����
		chArray = str4.toCharArray();
		
		//�ֽ����� �� �ַ�����ת�� 
		//byte ��������_ -128 To 127 ��ӦASIIC
		byte[] byteArray = {104,101,108,108,111};
		String str6 = new String(byteArray);
		System.out.println(str6);
		
		//�ַ���ת��
		String str7 = new String(str1.getBytes(),"UTF-8");
		System.out.println(str7);
		
		//trim������ȥ���ַ�����������Ŀո�
		//Ϊ�˸��õ��û����飬���û������û���֮��ʹ��
		Scanner input = new Scanner(System.in);
		System.out.println("input ur name:");
		//����next����nextLine
		String uName = input.nextLine().trim();
		System.out.println("--"+uName+"--");
		
		//concat����
		String a = "abc";
		String b = "234";
		String c = a + b;
		//cû����concat��ʹ����string buffer
		
		//compare to
		System.out.println("abc".equals("abc"));
		//��λ�Ƚ�asiic�룬ǰ-�� ����С��0��0������0��ѡ�� IgnoreCase
		System.out.println("abcf".compareTo("abcd"));
		
		//startswith����
		System.out.println("abc".startsWith("ab"));
		System.out.println("abcse".endsWith("se"));
		System.out.println("aafeeg".contains("fee"));
		
		//indexOf�����������±�
		String password = "1243412nsadf";
		System.out.println(password.contains("434"));
			//indexOf���Դ��룺�ַ����ַ���
		System.out.println(password.indexOf('3'));
		System.out.println(password.indexOf("nsa"));
			//�ӵڶ�����ʼ�����ҡ�12���������±�
		System.out.println(password.indexOf("12",2));
			//û�鵽�ķ���-1
		System.out.println(password.indexOf("adsf"));
		
		//�ж��ַ�����ֻ����һ��С����
		//isDecimal����
		
		//substring����
		//��ȡ�ķ�Χ��[begin,end)����ҿ�  or �ӵ�3��֮�����е�
		System.out.println(password.substring(1,5));
		System.out.println(password.substring(3));
		
		
		
		
	}

}
