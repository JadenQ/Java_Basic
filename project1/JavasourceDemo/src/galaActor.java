
/**
 * ��Ա����
 * @todo TODO
 * @author Jaden
 * @date 2020��1��3��,����9:44:07
 * @copyright Jaden
 */
public abstract class galaActor {
	public String name;
	
	public galaActor() {
	}
	
	public galaActor(String name) {
		setName(name);
	}

	public void performs() {
		System.out.println("�ݳ���"+name+"���ڱ��ݣ�");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
