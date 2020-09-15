package compareDemo;
//implements:方法2-1 见RoleBiz
public class Role {// implements Comparable<Role>{
	private String name;
	private String title;
	private int hp;
	private int attack;
	
	
	//构造方法
	public Role(String name, String title, int hp, int attack) {
		super();
		this.name = name;
		this.title = title;
		this.hp = hp;
		this.attack = attack;
	}
	
//	@Override
//	/**
//	 * 方法2-1的方法
//	 * 为了令Role能够使用comparable，需要实现一个compareTo方法
//   * 在Role 定义时要implement comparable接口
//	 */
//	public int compareTo(Role role) {
//		//为了能够使用collection中的sort方法进行排序，实体类要实现comparable接口
//		//为了方便观察，比较对象时候，使用血量对比,介绍给sort要按照什么去排序
//		if(hp > role.getHp()) return 1;
//		if(hp < role.getHp()) return -1;
//		return 0;
//	}
//	
	/**
	 * 为了便于使用删除，要重载equals方法
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Role)) {
			return false; //传入对象类型不匹配
		}
		Role role = (Role)obj;
		//如果两个对象的name属性相同，我们认为两个就相同（可以不按照这个想法）
		return name.equals(role.getName());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
}
