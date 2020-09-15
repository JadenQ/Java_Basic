package collection;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intCollection = new ArrayList<>();
		intCollection.add(123);
		intCollection.add(13);
		intCollection.add(13);
		intCollection.add(23);
		intCollection.add(1);
		intCollection.add(3);
		
		//������������
		intCollection.forEach(value -> System.out.println(value+","));
		Collections.shuffle(intCollection,new Random(20)); //ֻ�в��ø���collection ,��List�ſ���
		System.out.println("\n�����");
		intCollection.forEach(value -> System.out.println(value+","));
		
		Collections.shuffle(intCollection,new Random(20)); //ֻ�в��ø���collection ,��List�ſ���
		System.out.println("\n�����");
		intCollection.forEach(value -> System.out.println(value+","));
		
		System.out.println("���ϵĸ���");
		List<Integer> longCol = new ArrayList<>();  //���ÿռ�
		longCol.add(123);
		longCol.add(13);
		longCol.add(103);
		longCol.add(123);
		longCol.add(13);
		longCol.add(103);
		Collections.copy(longCol, intCollection);//����Ҫ��ͬ
		longCol.forEach(value -> System.out.println(value+","));
		
		//���޹���Ԫ��
		System.out.println(Collections.disjoint(intCollection, longCol));
		System.out.println("��ʾ������ָ��Ԫ�س��ֵĴ�����"+Collections.frequency(longCol,13));
		
		//���䣺ʹ��arrays.asListת���ɵ�list�����У��޷�ʹ��add���������ȹ̶��ˣ�
		//�ַ�������-��list
		List<String> strList = Arrays.asList("abc","223","232");
		
	}

}
