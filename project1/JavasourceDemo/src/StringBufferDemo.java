import java.util.Collections;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str1 = "a"; String str2 = "b"; String str3 = str1 + str2;
		 * 
		 * //底层实现： String str4 = new
		 * StringBuffer(String.valueOf(str1)).append(str2).toString();
		 */
		
		StringBuffer strBuffer1 = new StringBuffer("hello");
		StringBuffer strBuffer2 = new StringBuffer("hello");
		StringBuffer strBuffer3 = new StringBuffer("hello");
		//false
		System.out.println(strBuffer1.equals(strBuffer2));
		//true
		System.out.println(strBuffer1.toString().equals(strBuffer2.toString()));
		
		System.out.println(strBuffer1.reverse()); //反转字符串
		strBuffer1.insert(3, "abd"); //在某一个下标处插入某元素
		System.out.println(strBuffer1);
		
		strBuffer2.delete(2,4); //左闭右开
		strBuffer2.replace(2, 3, "l");
		strBuffer3.setCharAt(1, 'k'); //设置某一个位置字符wei...
		System.out.println(strBuffer2);
		System.out.println(strBuffer3);
		strBuffer1.setLength(0); //直接清空
		
		strBuffer3.trimToSize(); //将空间设置到某一长度
		
		final int N = 80000;
		
		long startTime = System.currentTimeMillis();
		String str = "*";
		for(int i = 0; i < N ; i++) {
			str += "*";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("+=用时："+(endTime-startTime)+"ms");
		
		//使用string buffer进行拼接
		startTime = System.currentTimeMillis();
		StringBuffer str1 = new StringBuffer("*");

		for(int i = 0; i < N ; i++) {
			str1.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("buffer用时："+(endTime-startTime)+"ms");
		
		//使用string builder
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("*");

		for(int i = 0; i < N ; i++) {
			str2.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("builder用时："+(endTime-startTime)+"ms");
		
		
	}

}
