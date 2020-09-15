package compareDemo;
//implements:����2-1 ��RoleBiz
public class Role {// implements Comparable<Role>{
	private String name;
	private String title;
	private int hp;
	private int attack;
	
	
	//���췽��
	public Role(String name, String title, int hp, int attack) {
		super();
		this.name = name;
		this.title = title;
		this.hp = hp;
		this.attack = attack;
	}
	
//	@Override
//	/**
//	 * ����2-1�ķ���
//	 * Ϊ����Role�ܹ�ʹ��comparable����Ҫʵ��һ��compareTo����
//   * ��Role ����ʱҪimplement comparable�ӿ�
//	 */
//	public int compareTo(Role role) {
//		//Ϊ���ܹ�ʹ��collection�е�sort������������ʵ����Ҫʵ��comparable�ӿ�
//		//Ϊ�˷���۲죬�Ƚ϶���ʱ��ʹ��Ѫ���Ա�,���ܸ�sortҪ����ʲôȥ����
//		if(hp > role.getHp()) return 1;
//		if(hp < role.getHp()) return -1;
//		return 0;
//	}
//	
	/**
	 * Ϊ�˱���ʹ��ɾ����Ҫ����equals����
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Role)) {
			return false; //����������Ͳ�ƥ��
		}
		Role role = (Role)obj;
		//������������name������ͬ��������Ϊ��������ͬ�����Բ���������뷨��
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
