import java.util.Arrays;
public class Array6SelectSort {

	public static void main(String[] args) {
		// 选择排序1.循环选定i 2.对于每一个i，一次找数组中的最小值（value和index）
		//3.将最小值和i位置进行交换
			// 冒泡排序
			final int N = 4000;
			//int[] nums = {12,43,45,66,3,1,54,56,23,50};
			//生成随机序列
			int[] nums = new int[N];
			int[] nums2 = new int[N];
			for(int i = 0; i < nums.length; i++) {
				nums[i] = (int)(Math.random()*48000);
				nums2[i] = nums[i];
			}
			System.out.println("\nbefore:");
			for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]+"\n");
			}
			//选择排序：交换i的值于minIndex的值
			long startTime = System.currentTimeMillis();
			
			for(int i = 0; i<nums.length; i++) {
				int min = nums[i]; //首先假设第i个值为最小值
				int minIndex = i; //i 为最小值的指数
				//for循环寻找最小值
				for(int j = i+1; j<nums.length; j++) {
					if(min > nums[j]) {
						min = nums[j];
						minIndex = j;
					}
				}
				int temp=nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("\n选择排序使用时间："+(endTime-startTime)+"ms");
			System.out.println("\nafter:");
			for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]+"\n");
			}
			
			//使用自带的排序： fastest
			long startTime2 = System.currentTimeMillis();
			Arrays.sort(nums2);
			long endTime2 = System.currentTimeMillis();
			System.out.println("\narrays工具包耗时："+(endTime2-startTime2)+"ms");
			
			//首尾交换
			for(int i =0; i < nums2.length/2; i++) {
				int temp = nums2[i];
				nums2[i] = nums2[nums2.length-i-1];
				nums2[nums2.length-i-1] = temp;
			}
			//可用collections.reverse
			
	}

}
