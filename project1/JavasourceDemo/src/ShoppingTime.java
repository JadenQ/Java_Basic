import java.util.Scanner; 

public class ShoppingTime {

	public static void main(String[] args) {
		// TODO ���ۼ�
		Scanner input = new Scanner(System.in);
		//������Ʒ�ĵ��ۺ�����
		double price, total; //���ۣ��ܼ�
		int count;//����
		double discount = 1; //�ۿ�
		System.out.print("·��˹�����ֱ��ۣ�");
		price = input.nextDouble();
		System.out.print("·��˹�����ֱ�������");
		count = input.nextInt();
		total = price*count;
		System.out.print("������Ƥ�����ۣ�");
		price = input.nextDouble();
		System.out.print("������Ƥ��������");
		count = input.nextInt();
		total += price*count;
		System.out.print("���ζ���ˮ���ۣ�");
		price = input.nextDouble();
		System.out.print("���ζ���ˮ������");
		count = input.nextInt();
		total += price*count;
		//�����ܼ�
		System.out.println("�ܼۣ�"+total);
		//�ж��ۿ����
		if(total >=50000) {
			discount *= 0.7;
		}
		else {discount *= 0.9;}
		
		//��ӡ��֧���Ľ��
		System.out.println("�ۺ�۸�"+total*discount+"\t"+"�ۿۣ�"+(total-total*discount));

	}

}
