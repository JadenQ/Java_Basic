
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
		// TODO ��������
		Inh_Warrior սʿ1 = new Inh_Warrior();
		Inh_Warrior սʿ2 = new Inh_Warrior();
		Inh_Warrior սʿ3 = new Inh_Warrior();
		Inh_Warrior սʿ4 = new Inh_Warrior();
		Inh_Warrior սʿ5 = new Inh_Warrior();
		
		Inh_Arh ��ʦ1 = new Inh_Arh();
		Inh_Arh ��ʦ2 = new Inh_Arh();
		Inh_Arh ��ʦ3 = new Inh_Arh();
		Inh_Arh ��ʦ4 = new Inh_Arh();
		Inh_Arh ��ʦ5 = new Inh_Arh();
		
		Inh_Hero[] heroArray = {
			սʿ1,սʿ2,սʿ3,սʿ4,սʿ5,
			��ʦ1,��ʦ2,��ʦ3,��ʦ4,��ʦ5
		};
		System.out.println("before");
		System.out.println("����\t�ǳ�\t\t\tmaxlife\tcurLife\t������");
		for(Inh_Hero hero : heroArray) {
			System.out.println(hero);
		}
		
		sort(heroArray);
		
		System.out.println("after");
		System.out.println("����\t�ǳ�\t\t\tmaxlife\tcurLife\t������");
		for(Inh_Hero hero : heroArray) {
			System.out.println(hero);
		}
	}

}
