import java.util.Scanner;
/**
 * 
 * @todo �ҵļ�����
 * @author Jaden
 * @date 2019��11��24��,����1:54:23
 * @copyright Jaden
 */
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String op = ""; // �������ֵΪ���ַ���
		double num1,num2,result; //�������
		String flag = "";   //�û�ѡ���Ƿ����
		
		do {
			System.out.println("����������������(�ո����)");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("�����������");
			op = input.next(); // ������nextline,��ѿո�����
			switch(op) {
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2==0) {System.out.println("��������Ϊ0"); result = 0;}
				else {result = num1 / num2;}
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("δ֪�������ʧ��");
				result = 0;
				break;
			}
			System.out.printf("%.2f %s %.2f = %.2f",num1,op,num2,result);
			System.out.println("\n\n�Ƿ�������м��㣿(y/n)");
			flag = input.next(); //ʹ��nextline���ó������
		}
		while("y".equalsIgnoreCase(flag));
		
	}
}
