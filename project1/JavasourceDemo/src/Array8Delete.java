import java.util.Scanner;

public class Array8Delete {

	public static void main(String[] args) {
		// TODO 先排序再删除（使用二分查找法）
		//1.找到要删除的元素的下标， delIndex = 3
		//2.从要删除的下标开始，后面的一个覆盖前面
		//3.数组总长度 - 1
		
		//数组插入，要保证总长度是足够的，即N
		Scanner input = new Scanner(System.in);
		int[] array = {2,5,6,13,54,55,58,65,223,256,277,412,433,445,476,478,500};
		System.out.println("输入要找并删除的数字");
		int searchNum = input.nextInt(); //要找的数字
		boolean isFind = false; //是否找到
		int low = 0; //下界下标
		int high = array.length-1; //上界下标
		int deleteIndex = -1; //要删除的下标
		int count = array.length; // 数组长度
		
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
				System.out.println("找到了，下标为："+mid);
				isFind = true;
				deleteIndex = mid;
				break;
			}
			
		}
		if(!isFind) {
			System.out.println("没找到");
			System.exit(0);
		}
		count--; //数组长度-1
		//后面的元素向前移动
		for(int i = deleteIndex; i< count; i++) {
			array[i] = array[i + 1];
		}
		for (int i = 0; i < count; i++) {
			System.out.print(array[i]+",");	
		}
		
	}
	
}
