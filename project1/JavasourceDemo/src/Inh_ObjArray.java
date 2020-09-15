
public class Inh_ObjArray {
	
	public static void sort(Inh_Hero[] heroArray) {
		Inh_Hero tempHero = null;
		for(int i = 0; i < heroArray.length; i++) {
			for(int j = 0; j < heroArray.length-1; i++) {
				if(heroArray[j].compareByName(heroArray[j+1]) < 0) {
					tempHero = heroArray[j];
					heroArray[j] = heroArray[j+1];
					heroArray[j + 1] = tempHero;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 对象数组
		Inh_Warrior 战士1 = new Inh_Warrior();
		Inh_Warrior 战士2 = new Inh_Warrior();
		Inh_Warrior 战士3 = new Inh_Warrior();
		Inh_Warrior 战士4 = new Inh_Warrior();
		Inh_Warrior 战士5 = new Inh_Warrior();
		
		Inh_Arh 法师1 = new Inh_Arh();
		Inh_Arh 法师2 = new Inh_Arh();
		Inh_Arh 法师3 = new Inh_Arh();
		Inh_Arh 法师4 = new Inh_Arh();
		Inh_Arh 法师5 = new Inh_Arh();
		
		Inh_Hero[] heroArray = {
			战士1,战士2,战士3,战士4,战士5,
			法师1,法师2,法师3,法师4,法师5
		};
		System.out.println("before");
		System.out.println("级别\t昵称\t\t\tmaxlife\tcurLife\t攻击力");
		for(Inh_Hero hero : heroArray) {
			System.out.println(hero);
		}
		
		sort(heroArray);
		
		System.out.println("after");
		System.out.println("级别\t昵称\t\t\tmaxlife\tcurLife\t攻击力");
		for(Inh_Hero hero : heroArray) {
			System.out.println(hero);
		}
	}

}
