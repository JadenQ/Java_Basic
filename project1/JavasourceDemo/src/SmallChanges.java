import java.util.Scanner;
/**
 * 
 * @todo 整钱换零钱
 * @author Jaden
 * @date 2019年11月20日,上午10:28:40
 * @copyright Jaden
 */
public class SmallChanges {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入钱的数量");
		double money = input.nextDouble();
		
		//处理整元部分
		int yuan = (int)money;
		int numOfshiyuan = yuan/10;
		int numOfWuyuan = yuan % 10 / 5;
		int numOfYiyuan = yuan % 10 - 5;//应当有If语句改进
		//处理角部分
		int jiao = ((int)(money*10)) % 10;
		int numOfWujiao = jiao / 5; //1角纸币
		int numOfYijiao = jiao - 5; //5角纸币
		
		//prinT
		System.out.println("10圆纸币数量："+numOfshiyuan);
		System.out.println("5圆纸币数量："+numOfWuyuan);
		System.out.println("1圆纸币数量："+numOfYiyuan);
		System.out.println("5角纸币数量："+numOfWujiao);
		System.out.println("1角纸币数量："+numOfYijiao);
	}
}
