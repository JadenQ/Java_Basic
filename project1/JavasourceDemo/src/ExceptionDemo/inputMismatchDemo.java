package ExceptionDemo;
import java.util.Scanner;
//���벻ƥ���쳣ʵ��
//�û���������ֻ�����������֣���ʹ���쳣������Ʋ������쳣���
public class inputMismatchDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������䣺");
		int age = -1;
		try {
			age = input.nextInt();
			age = age / 0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		//����ʹ�ö��catch���������catch
		//����catch(Exception1|Exception2...)
		catch(Exception e) { //���catch���󣬿��ܲ��񲻵�
			e.printStackTrace();//��ջ��ʽ��ӡ������Ϣ����throw��ķ���
			System.err.println(e.getMessage());
		}
		
		//int age = input.nextInt(); //������ȫ���쳣����
		System.out.println("���������Ϊ��"+age);
		//ֻ��system.exit(0)ʱ��ִ��finally
		//�ڳ��ִ����ʱ������finally����ִ����Ϻ�ǿ��Ҫ��ر����д򿪵���Դ
		//����ʡ��catch,���ǲ����ӡ�쳣��Ϣ
		//finally����Ĵ���һ����ִ�У���ʹ�쳣���Ͳ�ƥ��
		//finally {
			
	//	}

	}

}
