import java.util.Scanner;
/**
 * 
 * @todo ������ż���ĸ���
 * @author Jaden
 * @date 2019��11��27��,����9:51:06
 * @copyright Jaden
 */
public class NumsCount {

	public static void main(String[] args) {
		// 
		int[] nums = new int[10];
		int count1 = 0; //����
		int count2 = 0; //ż��
		int Index = -1; //�Ƿ��ҵ��ı�־ -1��δ�ҵ�, �����ӦΪ�±�
		//��������
		for(int i =0; i < nums.length;i++) {
			nums[i] = ((int)(Math.random()*100)) % 1001;
			System.out.print(nums[i]+",");
		}
		//��
		for(int i = 0; i< nums.length;i++) {
			if(nums[i] % 2 == 0) {
				count2++;
			}
			else{count1++;}
		}
		//�û�����������֣��ҵ��Ļ������±�
		System.out.println("����Ҫ���ҵ�Ԫ�أ�");
		int searchNum = new Scanner(System.in).nextInt();
		for(int i = 0; i< nums.length;i++) {
			if(searchNum == nums[i]) {
				Index = i;
				break;
			}
			
		}
		if(Index < 0) {
			System.out.println("û�и�Ԫ��");
		}
		else {System.out.println("�ҵ�Ԫ����"+Index);}

	}

}
