
public class Class6_String {

	public static void main(String[] args) {
		String value = "�й������ž�";
		value += "˹��һ";
		value.concat("��ţ!");
		value = value.concat("��ǿ��"); //�ַ������ɱ��ԣ�û�и���ԭ��value��ֵ
		System.out.println(value);
		
		//�ò�ͬ��ʽ�����ַ���
		String name1 = "xueyuan";
		String name2 = "xueyuan";
		
		//�����µĵ�ַ���д洢
		String name3 = new String("xueyuan");
		String name4 = new String("xueyuan");
		
		System.out.println(name1 == name2);
		System.out.println(name3 == name1);
		System.out.println(name3 == name4);
		
		String value1 = "Hello world";
		value1 += "good"; //�൱�ڵ�����concat,ֱ�ӷ���һ���µ��ַ�������ռ�
		
		String value2 = "Hello worldgood";
		
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
	}

}
