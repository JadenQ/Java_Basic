import java.util.Scanner;
/**
 * 
 * @todo �������������Զ��˳�
 * @author Jaden
 * @date 2019��11��22��,����10:21:20
 * @copyright Jaden
 */

public class PasswordDemo {

	public static void main(String[] args) {
		String password = null; //�����ʼ���������� " "��û��ָ���κ�ֵ
		String userName = ""; //���ַ������û���
		Scanner input = new Scanner(System.in);
		//����ͨ�����ó����ķ����������룺
		final String PASSWORD = "123456";
		System.out.println("���������룺");
		String realPassword = input.next();	
		//1.ѭ���ṹ
		int i = 0;
		while(i < 3) {
			System.out.println("����������:");
			password = input.next();
			
			//�ַ����жϣ�
			//if(password.equals(realPassword)) {
			if(!realPassword.equals(password)){ //��ֹ��ֵ������
				System.err.println("Wrong Password! You have "+ (2-i) + " times to try.");
				if(i == 2) {System.err.println("�Ѿ��������Σ�ǿ���˳�"); System.exit(0);}
				
			}
			else {
				i = 5; //�����˳�ѭ�� 
				System.out.println("������ȷ��");
				break;
			}
			i++;
		}

		
		//2.����ѭ������
		//3.������֤�û���������

	}

}
