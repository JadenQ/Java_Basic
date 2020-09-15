
/**
 * 演员父类
 * @todo TODO
 * @author Jaden
 * @date 2020年1月3日,上午9:44:07
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
		System.out.println("演出者"+name+"正在表演！");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
