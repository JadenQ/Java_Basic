import java.util.Scanner;
/**
 * 
 * @todo 奇数和偶数的个数
 * @author Jaden
 * @date 2019年11月27日,上午9:51:06
 * @copyright Jaden
 */
public class NumsCount {

	public static void main(String[] args) {
		// 
		int[] nums = new int[10];
		int count1 = 0; //奇数
		int count2 = 0; //偶数
		int Index = -1; //是否找到的标志 -1：未找到, 否则对应为下标
		//生成数组
		for(int i =0; i < nums.length;i++) {
			nums[i] = ((int)(Math.random()*100)) % 1001;
			System.out.print(nums[i]+",");
		}
		//查
		for(int i = 0; i< nums.length;i++) {
			if(nums[i] % 2 == 0) {
				count2++;
			}
			else{count1++;}
		}
		//用户输入查找数字，找到的话返回下标
		System.out.println("输入要查找的元素：");
		int searchNum = new Scanner(System.in).nextInt();
		for(int i = 0; i< nums.length;i++) {
			if(searchNum == nums[i]) {
				Index = i;
				break;
			}
			
		}
		if(Index < 0) {
			System.out.println("没有该元素");
		}
		else {System.out.println("找到元素在"+Index);}

	}

}
