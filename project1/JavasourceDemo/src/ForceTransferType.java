
public class ForceTransferType {
	public static void main(String[] args) {
		double num=90;   //8
		long LongNum=21334234222l;
		//int num1 = num;  //4 ���ڴ�����=��С�ڴ����� ��Ҫǿ��ת��
		//short<int<long<float<double
		int num1 = (int)num;
		int num2 = 5/2; //2
		double num3 = 5/2; //2 �ȼ������ͳ���
		double num4 = 5/2d; // ��ת������
		//ȡģʱ����ķ������һ��������һ��
		System.out.println(num2);
		//��Ԫ��������
		int result = num1 > num2 ? 90:80;
		System.out.println(result);
	}
}
