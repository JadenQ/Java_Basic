import java.util.Scanner;

public class Method4UnknownLengthPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramTest("test:",1,2,4,5,2,54);

	}
	/**
	 * 
	 * @param str
	 * @param nums ���������������һ������������Ҳֻ����һ��������������ȥҲ�ǿ��Եģ�����Ϊ0��
	 */
	public static void paramTest(String str, int... nums) {
		System.out.println("first:"+str);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	} 

}
