
public class RefPass2_Test {
	public static void main(String[] args) {
		int nums[] = {1,2};
		FailSwap(nums[0],nums[1]);
		System.out.println(nums[0]+"\tand\t"+nums[1]);
		Swap(nums); 
		System.out.println(nums[0]+"\tand\t"+nums[1]);
	}
	//ֻ������ֵ����û�жԵ�ַ���в���������ֵ�Ĳ���ֱ��FailSwap��
	public static void FailSwap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	//����������ĵ�ַ����������еĲ���Ӱ�쵽���鱾��
	public static void Swap(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}
}
