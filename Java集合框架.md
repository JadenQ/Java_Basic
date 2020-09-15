### Java集合框架：

一组存储对象的容器（动态）

#### JavaSE提供：

collection接口：存储另一个元素的集合

map接口（图）：存储键值对

Collections:操作集合的工具类

#### Collection架构：面向接口编程

三种主要类型的集合：

##### 1.set（规则集）：存储一组不重复的元素

###### 特点：操作存储一组唯一、无序的对象

-HashSet:用来存储互不相同的任何元素

-LinkedHashSet:使用链表拓展实现HashSet类，支持对元素的排序。

不需要维护被插入的顺序时，hashset较为高效

-TreeSet:可以确保所有元素都是有序的





##### 2.list（线性表）：存储一个有序集合

-ArrayList数组线性表：

a.是一个大小可变的数组，在内存中分配连续的空间。

b.遍历元素和随机访问元素的效率比较高，但是在删除、插入元素后，其他所有元素序列号需要都要修改，效率比较低

-LinkedList链表

a.采用链表存储方式

b.提供从线性表两端提取、插入和删除元素的方法

c.插入、删除元素效率比较高

d.随机访问的效率比较低，但是从两端提取删除、插入元素较为简单（直接修改地址）

-总结：

实际开发中可能两种情况（随机访问与删除）交替出现，建议使用父接口List，不用关心具体的实现，在具体情况下传入或转换成相应的子类型就可以

![capture_20200302112753374](D:\picture\ScreenCapture\capture_20200302112753374.bmp)

##### 3.queue（队列）：存储用先进先出方式处理的对象

注意：

1.集合框架所有接口和类都在java.util包

2.集合框架中所有的具体类都实现了cloneable和serializable接口，即都是可复制可序列化的

###### -直接使用时可能造成操作意义不明确，所以在实际开发中不建议直接使用collection

Element:元素   泛型编程

![](D:\picture\ScreenCapture\capture_20200301095846699.bmp)

##### 4.练习

![](D:\picture\ScreenCapture\capture_20200302100923046.bmp)

##### 5.Vector

```java
	// Vector从Java1.0就存在了，arraylistjava1.2才存在
	//Vector 的使用场景，javame等一些小版本可以使用，arraylist不可以
	//java1.2之前，vector提供了可变大小数组
	//swing数据模型都使用了vector
	//相较于arraylist，vector中的方法采用了线程同步，效率比arraylist低
	//默认capacity增长量为一倍
		Vector<String> vec = new Vector<>(); //空构造
		//synchronize:线程同步  不能在同一时刻使用
//添加:
vec.add("aaa"); //返回boolean
vec.addElements("aaa"); //void  
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
```

遍历：1.可以使用for循环 2.iterator迭代器遍历，与list遍历相同 3.早期版本的代码中可以使用枚举遍历 4.lamda表达式遍历

![capture_20200303103250886](D:\picture\ScreenCapture\capture_20200303103250886.bmp)

##### 6.Queue

![capture_20200304104052883](D:\picture\ScreenCapture\capture_20200304104052883.bmp)

deQue:支持双端进行添加和删除操作

##### 7.集合使用的建议

ArrayList/LinkedList/ArrayDque/HashSet/LinkedHashSet/TreeSet

1.如果遍历List集合，Arraylist Vector ，随机遍历get效率更高

LinkedList/LinkedHashSet:迭代器效率更高

2.经常执行插入、删除操作来改变包含大量数据的集合：LinkedList更好，arraylist需要重新分配内部数组大小，影响效率

3.如果有多个线程需要同时访问集合中的元素，可以用collections将集合包装成线程安全的集合（Vectors）

