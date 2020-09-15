
public class Array3MaxMin {

	public static void main(String[] args) {
		// 求数组中的最大值和最小值
		int[] nums = new int[10];
		for(int i =0; i < nums.length;i++) {
			nums[i] = ((int)(Math.random()*100)) % 1001;
			System.out.print(nums[i]+",");
		}
		
		//求最大或最小
		//1.假设第一个元素为最大/最小
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] > max) {max = nums[i];}
			if(nums[i] < min) {min = nums[i];}
			
		}
		System.out.println("\t"+max+"and"+min);
		
	}

}
