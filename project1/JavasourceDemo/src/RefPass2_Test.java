
public class RefPass2_Test {
	public static void main(String[] args) {
		int nums[] = {1,2};
		FailSwap(nums[0],nums[1]);
		System.out.println(nums[0]+"\tand\t"+nums[1]);
		Swap(nums); 
		System.out.println(nums[0]+"\tand\t"+nums[1]);
	}
	//只传入了值，而没有对地址进行操作，即对值的操作直在FailSwap内
	public static void FailSwap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	//输入了数组的地址，对数组进行的操作影响到数组本身
	public static void Swap(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}
}
