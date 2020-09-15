package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo_Old {

	public static void main(String[] args) {
		// Vector从Java1.0就存在了，arraylistjava1.2才存在
		//Vector 的使用场景，javame等一些小版本可以使用，arraylist不可以
		//java1.2之前，vector提供了可变大小数组
		//swing数据模型都使用了vector
		//相较于arraylist，vector中的方法采用了线程同步，效率比arraylist低
		//默认capacity增长量为一倍
		Vector<String> vec = new Vector<>(); //空构造
		//synchronize:线程同步  不能在同一时刻使用
		
		vec.add("天龙八部");
		//添加:
		vec.add("aaa"); //返回boolean
		vec.addElement("aaa"); //void  
		
		System.out.println("size"+vec.size());
		System.out.println("size"+vec.capacity());
		vec.trimToSize();
		
		//枚举:早期的迭代器
		Enumeration<String> vecEnum = vec.elements();
		while(vecEnum.hasMoreElements()){
		    System.out.print(vecEnum.nextElement()+",");
		}
		System.out.println();
		//lamda表达式
		vec.forEach(str->System.out.print(str+","));
		//查询元素
		System.out.println("第一个元素"+vec.firstElement());
		System.out.println("下标为2的元素"+vec.elementAt(2)+"\t"+vec.get(2));
	}

}
