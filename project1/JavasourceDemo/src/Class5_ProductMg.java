import javax.swing.JOptionPane;

//������Ʒ

public class Class5_ProductMg {
	public static void main(String[] args) {
		//counts��������������Ʒ��ÿ����Ʒ������
		int[] counts = new int[3]; 
		double total = 0; //�ܽ��
		//��������ֻ�����˵�ַ���֣�û�з���ռ䣬Ҫ��ѭ���ڷ���ռ�
		Class5_Product[] product = new Class5_Product[3];
		for(int i = 0; i <counts.length; i++) {
			//����Ķ���Ԫ��product������ѭ���ڣ�������ѭ����������������
			//Class5_Product product = new Class5_Product();
			if(product[i] == null) //����ռ���Ļ�û�з���
				product[i] = new Class5_Product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			product[i].setName(name);
			//�����û��������Ʒ���ۣ����Ϊ�ַ���
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ��ۣ�");
			//ת��Ϊdouble
			//���ð�װ��
			double price = Double.parseDouble(strPrice);
			product[i].setPrice(price);
			String strCount = JOptionPane.showInputDialog("�����빺���������");
			counts[i] = Integer.parseInt(strCount);
			
			//�ۼ�
			total += product[i].getPrice()*counts[i];
		}
		
		
		
//		for(int i = 0; i <counts.length; i++) {
//			//����Ķ���Ԫ��product������ѭ���ڣ�������ѭ����������������
//			Class5_Product product = new Class5_Product();
//			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
//			product.setName(name);
//			//�����û��������Ʒ���ۣ����Ϊ�ַ���
//			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ��ۣ�");
//			//ת��Ϊdouble
//			//���ð�װ��
//			double price = Double.parseDouble(strPrice);
//			product.setPrice(price);
//			String strCount = JOptionPane.showInputDialog("�����빺���������");
//			counts[i] = Integer.parseInt(strCount);
//			
//			//�ۼ�
//			total += product.getPrice()*counts[i];
//		}
		
		System.out.println("������㣺");
		for(int i = 0; i< product.length;i++) {
			System.out.println(product[i].getName()+"\t����Ϊ��"+product[i].getPrice()+"\t���������"+counts[i]);
		}
		System.out.println("��Ʒ���Ϊ��"+ total);
	}
}
