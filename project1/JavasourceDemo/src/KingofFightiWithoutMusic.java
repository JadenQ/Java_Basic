import java.util.Scanner;

/**
 * 
 * @todo 之后再考虑怎么加音乐
 * @author Jaden
 * @date 2019年11月24日,上午11:01:13
 * @copyright Jaden
 */
public class KingofFightiWithoutMusic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//播放音乐
		
		
		//随机数字
		//得到a-b之间的数值：需要模 （b-a+1）后 + a
		//(int)(Math.random()*10000) % 10 + 5 【5-14】
		//目标：
		//1.让双方选择名字（让用户选择）
		System.out.println("请输入用户名称");
		String Username = input.next();
		String comName = "大蛇";
		System.out.println(Username + "VS" + comName);
		
		//2.初始化双方的数据（100default）
		int hp1 = 100, hp2 = 100;   //hp1是用户，hp2是电脑大蛇
		int attack1 = 0, attack2 = 0;
		while(hp1>0 && hp2>0) {
			attack1 = (int)(Math.random()*1000) % 13 + 5;
			attack2 = (int)(Math.random()*998) % 10 + 5;
			
			//玩家先攻击
			hp2 -= attack1;
			System.out.println(comName+"受到"+attack1+"点攻击,"+"剩余血量为"+hp2);
			hp1 -= attack2;
			System.out.println(Username+"受到"+attack2+"点攻击,"+"剩余血量为"+hp1);
			
 		}
		System.out.println("KO!");
		if(hp1 > hp2) {
			System.out.println("You win!");
		}
		else {
			System.out.println("You lose!");
		}
		
		
		//3.使用循环模拟对战过程 可以加入一些防守、暴击
		//4.打印最终结果
		
		
	}
}
