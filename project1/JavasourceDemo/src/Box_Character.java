import java.util.Scanner;

public class Box_Character {
	public static boolean IsDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch = '8';
		Character.isDigit(ch); //�ж��Ƿ�Ϊ0-9������
		
		//�жϣ�
		System.out.println(IsDigit('9'));
		//��дӦ�ã��û�������ַ����ǲ��Ǵ�����
		boolean flag = true; //�Ƿ�Ϊ������
		System.out.println("�������֣��ж��Ƿ�Ϊ�����֣�");
		String value = new Scanner(System.in).next();
		//String.At ����ĳ���±�ֵ�ϵ��ַ�
		//String.length�����ַ��ĳ���
		for(int i = 0; i < value.length();i++) {
			//if(!IsDigit(value.charAt(i))) {   //��������
			if(!Character.isDigit(value.charAt(i))) {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("����һ�������֣�");
		}
		else {System.out.println("��һ��������");}
	}

}
