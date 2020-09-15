/**
 * 
 * @todo 尝试数组
 * @author Jaden
 * @date 2019年11月26日,上午10:42:13
 * @copyright Jaden
 */
public class Array1 {

	public static void main(String[] args) {
		// 尝试数组
		//int[] nums = null; 会造成空指针异常：没有空间 
		// int num 基本类型：在栈内存中自动分配内存
		//Scanner input = new Scanner(System.in); 
		//new ： 在堆内存中手动分配了空间 molloca
		int[] nums = new int[5]; //默认为0元素
		//左边:分配了栈内存；右边，利用new分配了堆空间
		//数组名是新分配的内存空间的首地址：先声明数组，再分配空间
		System.out.println(nums); //Java虚拟机的内存地址：哈希码
		//声明数组时，如果后面已经给出了具体数组的内容，就不需要声明长度了
		// xxxx! int year[6] = {1,2,4,5,6,7};
		// int array[] = {}; 不能再为数组元素赋值了，无意义
		
	}

}
