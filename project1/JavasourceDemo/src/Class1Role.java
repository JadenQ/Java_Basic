
public class Class1Role {
	
	/**��������**/
	public String name;
	/**�ȼ�**/
	public int level;
	/**ְҵ*/
	public String job;
	
	//Ĭ�Ϲ��죺���Բ�д;��������ʵ��Ĭ�Ϲ����һ������
	public Class1Role() {}
	
	/**
	 * ���췽����������
	 * 1.û�з���ֵ
	 * 2.������������һ��
	 */
	public Class1Role(String name1, int level1, String job1) {
		name = name1;
		level = level1;
		job = job1;
	}
	
	/**skills*/
	public void doSkill() {
		if(name.equals("����")) {
			System.out.println(name+"____kill with guns");
		}
		else if(name.equals("�����")) {
			System.out.println(name+"____kin-kong stick");
		}
		
	}
	
	public void show(){
		System.out.println(name+"\tְҵ��"+job+"\t�ȼ���"+level);
	}
	
	
}
