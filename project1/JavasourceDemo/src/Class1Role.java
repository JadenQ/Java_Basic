
public class Class1Role {
	
	/**名称属性**/
	public String name;
	/**等级**/
	public int level;
	/**职业*/
	public String job;
	
	//默认构造：可以不写;构造器其实是默认构造的一种重载
	public Class1Role() {}
	
	/**
	 * 构造方法：构造器
	 * 1.没有返回值
	 * 2.方法名和类名一致
	 */
	public Class1Role(String name1, int level1, String job1) {
		name = name1;
		level = level1;
		job = job1;
	}
	
	/**skills*/
	public void doSkill() {
		if(name.equals("劳拉")) {
			System.out.println(name+"____kill with guns");
		}
		else if(name.equals("孙悟空")) {
			System.out.println(name+"____kin-kong stick");
		}
		
	}
	
	public void show(){
		System.out.println(name+"\t职业："+job+"\t等级："+level);
	}
	
	
}
