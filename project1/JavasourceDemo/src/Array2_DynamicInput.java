import java.util.Scanner;
/**
 * 
 * @todo 动态赋值，录入成绩后求平均成绩
 * @author Jaden
 * @date 2019年11月26日,上午10:55:42
 * @copyright Jaden
 */
public class Array2_DynamicInput {

	public static void main(String[] args) {
		// 动态录入
		Scanner input = new Scanner(System.in);
		final int N = 5;   //可以用变量表示一个数组的长度。
		double[] scores = new double[N];
		double sum = 0 , avg;
		for(int i = 0; i < scores.length; i++) {
			System.out.print("请输入第 "+(i+1)+"位同学的成绩：");
			scores[i] = input.nextDouble();
		}
		
		//打印
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.printf("%d位评价成绩：%.2f",scores.length,sum/scores.length);
	}

}
