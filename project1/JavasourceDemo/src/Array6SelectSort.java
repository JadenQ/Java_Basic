import java.util.Arrays;
public class Array6SelectSort {

	public static void main(String[] args) {
		// ѡ������1.ѭ��ѡ��i 2.����ÿһ��i��һ���������е���Сֵ��value��index��
		//3.����Сֵ��iλ�ý��н���
			// ð������
			final int N = 4000;
			//int[] nums = {12,43,45,66,3,1,54,56,23,50};
			//�����������
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
			//ѡ�����򣺽���i��ֵ��minIndex��ֵ
			long startTime = System.currentTimeMillis();
			
			for(int i = 0; i<nums.length; i++) {
				int min = nums[i]; //���ȼ����i��ֵΪ��Сֵ
				int minIndex = i; //i Ϊ��Сֵ��ָ��
				//forѭ��Ѱ����Сֵ
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
			System.out.println("\nѡ������ʹ��ʱ�䣺"+(endTime-startTime)+"ms");
			System.out.println("\nafter:");
			for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]+"\n");
			}
			
			//ʹ���Դ������� fastest
			long startTime2 = System.currentTimeMillis();
			Arrays.sort(nums2);
			long endTime2 = System.currentTimeMillis();
			System.out.println("\narrays���߰���ʱ��"+(endTime2-startTime2)+"ms");
			
			//��β����
			for(int i =0; i < nums2.length/2; i++) {
				int temp = nums2[i];
				nums2[i] = nums2[nums2.length-i-1];
				nums2[nums2.length-i-1] = temp;
			}
			//����collections.reverse
			
	}

}
