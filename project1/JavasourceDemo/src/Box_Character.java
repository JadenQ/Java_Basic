import java.util.Scanner;

public class Box_Character {
	public static boolean IsDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch = '8';
		Character.isDigit(ch); //判断是否为0-9的数字
		
		//判断：
		System.out.println(IsDigit('9'));
		//手写应用：用户输入的字符串是不是纯数字
		boolean flag = true; //是否为纯数字
		System.out.println("输入数字，判断是否为纯数字：");
		String value = new Scanner(System.in).next();
		//String.At 返回某个下标值上的字符
		//String.length返回字符的长度
		for(int i = 0; i < value.length();i++) {
			//if(!IsDigit(value.charAt(i))) {   //两个都可
			if(!Character.isDigit(value.charAt(i))) {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("不是一个纯数字！");
		}
		else {System.out.println("是一个纯数字");}
	}

}
