/**
 * 
 * @todo 
 *      2015�꽻�׶�Ϊ800��Ԫ��ÿ�����25%����һ�꽻�׶2000��?
 * @author Jaden
 * @date 2019��11��22��,����10:55:06
 * @copyright Jaden
 */
public class AlibabaTrade {

	public static void main(String[] args) {
		//ѭ��������
		int year = 2015;
		double money = 800;
		while(money <= 2000) {
			year++;
			money *= 1.25;			
		}
		System.out.println("�ڵ�" + year+ "�꣬���׶�ﵽ/����2000��Ԫ"+"��"+money+"��Ԫ��");
		String str = String.format("%d�꣬���׶�ﵽ��%.2f��Ԫ����Խ2000��Ԫ��",year,money);
		System.out.println(str);
	}

}
