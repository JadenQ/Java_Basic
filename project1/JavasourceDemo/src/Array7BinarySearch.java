import java.util.Scanner;
public class Array7BinarySearch {

	public static void main(String[] args) {
		// TODO 二分查找：前提是数组已经按照升序排列了
		//效率高于普通查找：一个个查找
		Scanner input = new Scanner(System.in);
		int[] array = {2,5,6,2,54,23,4,65,223,65,77,4,33,245,76,78,0};
		System.out.println("输入要找的数字");
		int searchNum = input.nextInt(); //要找的数字
		boolean isFind = false; //是否找到
		int low = 0; //下界下标
		int high = array.length-1; //上界下标
		//不知道查找次数
		while(high >= low) {
			//计算中点下标
			int mid = (high + low)/2;
			//key小于中间元素
			if(searchNum < array[mid]) {
				high = mid -1; //移动上界
			}
			else if(searchNum > array[mid]) {
				low = mid + 1;
			}
			else {
				System.out.println("找到了，下标为："+(mid+1));
				isFind = true;
				break;
			}
			
		}
		if(!isFind) {System.out.println("没找到");}
	}

}
//bug:存在两个相同的元素怎么办？