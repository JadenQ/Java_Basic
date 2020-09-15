package interface_pkGame;

public class Warrior extends Hero{

	//���췽��
		public Warrior() {
			super();
			setName("defaultName");
		}
		
		public Warrior(long id, String name, int x, int y) {
			super(id,name);
			setX(x);
			setY(y);
		}
		
		
		
		@Override 
		public boolean closeEnough(Assailable hero) {
			double distance = getDis(getX(),getY(),hero.getX(),hero.getY());
			//սʿ��������Ϊ100�̶�
			return distance <= 100;
		}
		
		@Override 
		public void fight(Assailable hero) {
			//1.��������Ĺ�����
			int attack = ((int)(Math.random() * 1000)) % 51 + 20; //20-70
			setAttack(attack);
			//2.������Ӣ�۵�hp��ȥ
			hero.setHp(hero.getHp()-attack);
			System.out.println("սʿ����ɹ�������");
		} 
}
