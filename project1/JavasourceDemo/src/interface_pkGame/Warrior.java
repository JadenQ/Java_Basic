package interface_pkGame;

public class Warrior extends Hero{

	//构造方法
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
			//战士攻击距离为100固定
			return distance <= 100;
		}
		
		@Override 
		public void fight(Assailable hero) {
			//1.生成随机的攻击力
			int attack = ((int)(Math.random() * 1000)) % 51 + 20; //20-70
			setAttack(attack);
			//2.将传入英雄的hp减去
			hero.setHp(hero.getHp()-attack);
			System.out.println("战士打击成功！！！");
		} 
}
