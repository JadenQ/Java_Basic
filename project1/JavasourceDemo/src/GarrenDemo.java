import java.util.Scanner;

/**
 * 
 * @todo 盖伦的属性
 * @author Jaden
 * @date 2019年11月17日,下午9:29:27
 * @copyright Jaden
 */
public class GarrenDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("生命值：*****");
		System.out.println("物理攻击：***");
		System.out.println("技能伤害：****");
		double attack = 57.88;
		double attackGrowth = 4.5;
		//input attack and Growth
		System.out.print("伤害：");
		attack = input.nextDouble();
		System.out.print("伤害增长值：");
		attackGrowth = input.nextDouble();
		
		System.out.printf("\n伤害：%.2f(%.2f)\n",attack,attackGrowth);
		String line1 = String.format("\n伤害：%.2f(+%.2f)=%.1f",attack,attackGrowth,attack+attackGrowth);
		System.out.println(line1);
	}
	
}
