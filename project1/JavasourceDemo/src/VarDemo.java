/**
 * 
 * @todo �����������ӡ���
 * @author Jaden
 * @date 2019��11��17��,����9:54:54
 * @copyright Jaden
 */
public class VarDemo {
	public static void main(String[] args) {
		String brand = "��˶ASUS"; //Ʒ��
		String type = "GTX 1080"; //�ͺ�
		int hz = 1569;
		float length = 29.8f; //Ĭ��С��is double
		float width = 13.4f;
		double height = 5.25;
		//integer�����ֵ��Сֵ
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//ȡ������
		System.out.println(1.0-0.9);
		//������������ڴ���˷�
		System.out.println("Ʒ�ƣ�"+brand);
		System.out.println("�ͺţ�"+type);
		System.out.println("����Ƶ�ʣ�"+hz+"Mhz");
		System.out.println("����ߣ�"+length+"\t"+width+"\t"+height);
		System.out.println("_______�ָ���_______");
		System.out.println("��Ʒ����\t����\t����\t��ע");
		String name1= "�ɿ���";
		double price1 = 30.9; //����
		int count1 = 10;	//����
		String remark1 = "�˿̽�˿��"; //��ע
		System.out.printf("%s\t%.2f\t%d\t%s",name1,price1,count1,remark1);
		System.out.println("\n"+name1+"\t"+price1+"\t"+count1+"\t"+remark1);
		//�ַ�������
		 String str= String.format("%f",price1);
		 System.out.println(str);
		System.err.println("I'm error!");
	}
}
//����������
