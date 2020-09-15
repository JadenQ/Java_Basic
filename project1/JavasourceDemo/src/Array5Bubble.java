
public class Array5Bubble {

	public static void main(String[] args) {
		// 冒泡排序
		final int N = 8000;
		//int[] nums = {12,43,45,66,3,1,54,56,23,50};
		//生成随机序列
		int[] nums = new int[N];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*48000);
		}
		System.out.println("before:");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		//排序
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length-i-1; j++) {
				if(nums[j] < nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\n使用时间："+(endTime-startTime)+"ms");
		System.out.println("\nafter:");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}

	}

}
