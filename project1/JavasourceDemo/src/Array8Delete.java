import java.util.Scanner;

public class Array8Delete {

	public static void main(String[] args) {
		// TODO ��������ɾ����ʹ�ö��ֲ��ҷ���
		//1.�ҵ�Ҫɾ����Ԫ�ص��±꣬ delIndex = 3
		//2.��Ҫɾ�����±꿪ʼ�������һ������ǰ��
		//3.�����ܳ��� - 1
		
		//������룬Ҫ��֤�ܳ������㹻�ģ���N
		Scanner input = new Scanner(System.in);
		int[] array = {2,5,6,13,54,55,58,65,223,256,277,412,433,445,476,478,500};
		System.out.println("����Ҫ�Ҳ�ɾ��������");
		int searchNum = input.nextInt(); //Ҫ�ҵ�����
		boolean isFind = false; //�Ƿ��ҵ�
		int low = 0; //�½��±�
		int high = array.length-1; //�Ͻ��±�
		int deleteIndex = -1; //Ҫɾ�����±�
		int count = array.length; // ���鳤��
		
		//��֪�����Ҵ���
		while(high >= low) {
			//�����е��±�
			int mid = (high + low)/2;
			//keyС���м�Ԫ��
			if(searchNum < array[mid]) {
				high = mid -1; //�ƶ��Ͻ�
			}
			else if(searchNum > array[mid]) {
				low = mid + 1;
			}
			else {
				System.out.println("�ҵ��ˣ��±�Ϊ��"+mid);
				isFind = true;
				deleteIndex = mid;
				break;
			}
			
		}
		if(!isFind) {
			System.out.println("û�ҵ�");
			System.exit(0);
		}
		count--; //���鳤��-1
		//�����Ԫ����ǰ�ƶ�
		for(int i = deleteIndex; i< count; i++) {
			array[i] = array[i + 1];
		}
		for (int i = 0; i < count; i++) {
			System.out.print(array[i]+",");	
		}
		
	}
	
}
