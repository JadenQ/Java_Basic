
public class Wrap1_Boxing {

	public static void main(String[] args) {

		// TODO ��װ�ࡪ��װ�䡢����

		Integer num1 = 100; //�Զ�װ��
		//Integer num1 = Integer.valueOf(200);
		Integer num2 = 100;
		System.out.println(num1 == num2);
		//num1,num2��-128��127֮�䣬ֱ��ʹ���Ѿ�����õĶ���
		//���ռ���ͬһ����û��ʹ���µĿռ�
		Integer num3 = 200; //�Զ�װ��
		//Integer num1 = Integer.valueOf(200);
		Integer num4 = 200;
		System.out.println(num3 == num4);
		//��ȷ���0��
		System.out.println(num1.compareTo(num2));
		
		
		/*
		 * //double չʾ�� double num1 = 3.14; //����װ��ķ���
		 * 
		 * @SuppressWarnings("deprecation") Double dNum1 = new Double("3.14"); //Double
		 * dNum1_1 = new Double.valueOf(num1); Double dNum1_2 = 3.13; //�Զ�װ��
		 * 
		 * //���� num1 = dNum1_2.doubleValue(); //ȡ�����е���ֵ num1 = dNum1;
		 * //�Զ����䡪���������������ԣ�ֻ����ֵ
		 * 
		 * 
		 * System.out.println(num1+"\t"+dNum1);
		 */
	}

}
