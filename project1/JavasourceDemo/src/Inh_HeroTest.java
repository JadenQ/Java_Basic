
public class Inh_HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inh_Warrior Seatle = new Inh_Warrior("Seatle",34);
		System.out.println(Seatle.getNickName());
		Seatle.move();
		
		Inh_Hero ���� = new Inh_Warrior("����",344);
		����.move();
		
		Inh_Arh shamer = new Inh_Arh();
		shamer.fire();
		//��ӡ��Ϣ��������ͨ����дtoString��������ʡʱ��һ���ӡ��
//		System.out.println("level:"+shamer.getLevel());
//		System.out.println("maxLife"+shamer.getMaxLife());
//		System.out.println("curLife"+shamer.getCurLife());
		System.out.println(shamer);
		
		
		//�Ƿ���ͬ��
		Inh_Warrior caocao1 = new Inh_Warrior("caocao",1500);
		Inh_Warrior caocao2 = new Inh_Warrior("caocao",1500);
		//����ͬ
		System.out.println(caocao1 == caocao2);   //false
		System.out.println(caocao1.equals(caocao2)); //false->(��д��)->true
		
		//���õȼ�
		caocao1.setLevel(98);
		caocao2.setLevel(54);
		//�Ƚϵȼ�
		System.out.println(caocao1.compareTo(caocao2));
		//ԭ��
		//Everything is an Object
		//�κθ���Ĭ�ϣ�extends Object
		//�����
		//��дInh_Warrior �е�equals
		
		//����һ����д��toString
		
		System.out.println(caocao1.toString()); // ����һ��ʮ������
		System.out.println(caocao1); // ����һ��ʮ������,��д������д���
		
	}

}
