/**
 * 
 * @todo 쳲���������
 * @author Jaden
 * @date 2019��11��27��,����9:12:14
 * @copyright Jaden
 */
public class FibonacciDemo {

	public static void main(String[] args) {
		// 0��1��1��2��3��5...
		int[] nums = new int[11];
		int sum = 0;
		nums[0] = 0;
		nums[1] = 1;
		for(int i = 2; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
			sum += nums[i];
		}
		//��ӡ���
		for(int i = 0; i< nums.length; i++) {
			System.out.println(nums[i]+",");
		}
		System.out.println("sum:"+sum/1.0/nums.length); //��1.0תΪdouble
	}

}
