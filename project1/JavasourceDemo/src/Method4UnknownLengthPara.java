import java.util.Scanner;

public class Method4UnknownLengthPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramTest("test:",1,2,4,5,2,54);

	}
	/**
	 * 
	 * @param str
	 * @param nums 不定长参数在最后一个，方法里面也只能用一个；不传参数进去也是可以的（长度为0）
	 */
	public static void paramTest(String str, int... nums) {
		System.out.println("first:"+str);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	} 

}
