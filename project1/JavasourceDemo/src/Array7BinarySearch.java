import java.util.Scanner;
public class Array7BinarySearch {

	public static void main(String[] args) {
		// TODO ���ֲ��ң�ǰ���������Ѿ���������������
		//Ч�ʸ�����ͨ���ң�һ��������
		Scanner input = new Scanner(System.in);
		int[] array = {2,5,6,2,54,23,4,65,223,65,77,4,33,245,76,78,0};
		System.out.println("����Ҫ�ҵ�����");
		int searchNum = input.nextInt(); //Ҫ�ҵ�����
		boolean isFind = false; //�Ƿ��ҵ�
		int low = 0; //�½��±�
		int high = array.length-1; //�Ͻ��±�
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
				System.out.println("�ҵ��ˣ��±�Ϊ��"+(mid+1));
				isFind = true;
				break;
			}
			
		}
		if(!isFind) {System.out.println("û�ҵ�");}
	}

}
//bug:����������ͬ��Ԫ����ô�죿