
public class Inh_HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inh_Warrior Seatle = new Inh_Warrior("Seatle",34);
		System.out.println(Seatle.getNickName());
		Seatle.move();
		
		Inh_Hero 韩信 = new Inh_Warrior("韩信",344);
		韩信.move();
		
		Inh_Arh shamer = new Inh_Arh();
		shamer.fire();
		//打印信息（但可以通过重写toString方法来节省时间一起打印）
//		System.out.println("level:"+shamer.getLevel());
//		System.out.println("maxLife"+shamer.getMaxLife());
//		System.out.println("curLife"+shamer.getCurLife());
		System.out.println(shamer);
		
		
		//是否相同？
		Inh_Warrior caocao1 = new Inh_Warrior("caocao",1500);
		Inh_Warrior caocao2 = new Inh_Warrior("caocao",1500);
		//不相同
		System.out.println(caocao1 == caocao2);   //false
		System.out.println(caocao1.equals(caocao2)); //false->(重写后)->true
		
		//设置等级
		caocao1.setLevel(98);
		caocao2.setLevel(54);
		//比较等级
		System.out.println(caocao1.compareTo(caocao2));
		//原因
		//Everything is an Object
		//任何父类默认，extends Object
		//解决：
		//重写Inh_Warrior 中的equals
		
		//另外一个重写：toString
		
		System.out.println(caocao1.toString()); // 返回一个十六进制
		System.out.println(caocao1); // 返回一个十六进制,重写后按照重写输出
		
	}

}
