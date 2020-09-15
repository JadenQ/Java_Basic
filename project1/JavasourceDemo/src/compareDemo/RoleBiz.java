package compareDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * 角色的业务类
 * @todo TODO
 * @author Jaden
 * @date 2020年3月2日,上午10:13:41
 * @copyright Jaden
 */
public class RoleBiz {
	//Role[] roleArray = new Role[999];  不再用这种方法
	List<Role> roleList = null;
	//建立一个新的arraylist
	public RoleBiz() {
		roleList = new ArrayList<>();
	}
	/**
	 * 添加角色对象
	 * @param role
	 */
	public void add(Role role) {
		if(role != null) {
			roleList.add(role);
		}
	}
	/**
	 * 显示信息
	 */
	public void show() {
		System.out.println("\n角色\t称号\t气血\t攻击力");
		System.out.println("-------------------------------");
		//使用迭代器进行遍历打印
		Iterator<Role> roleIt = roleList.iterator();
		while(roleIt.hasNext()) {
			Role role = roleIt.next();
			System.out.println(role.getName()+"\t"+role.getTitle()+"\t"+role.getHp()+"\t"+role.getAttack());
		}
	}
	/**
	 * 删除一个元素：可以重写equals方法，便于在集合中可以找出要删除的元素
	 * @param role
	 */
	public void delete(Role role) {
		roleList.remove(role);
	}
	
	/**
	 * 将传入的角色对象在集合中进行修改
	 * @param role
	 */
	public void update(Role role) {
		//1.在集合中找到这个对象:indexof使用了equals方法寻找
		//2.修改对象
		int index = roleList.indexOf(role);
		if(index != -1) {
			roleList.set(index, role);
		}
	}
	
	/**
	 * 按照某种比较指标进行排序
	 */
	public void sort() {
	//1.自己实现冒泡、插入、快速
	//2.使用内置的工具类进行排序 - 前提：必须实现比较器接口
		//2-1.实体类实现comparable接口 要使用collections.sort需要在role添加课比较器接口
		//需要在Role.java中修改
//		Collections.sort(roleList);  //顺序
//		Collections.reverse(roleList);  //逆序
		//2-2.自定义一个比较器接口对象:仅使用rolebiz.java中的RoleComparator_(any)
		//顺序
	// Collections.sort(roleList, new RoleComparator_Attack());
		//逆序
		Collections.sort(roleList, Collections.reverseOrder(new RoleComparator_Attack()));
		Collections.shuffle(roleList); //乱序
	}
	/**
	 * 角色类中攻击力的比较器
	 * @todo TODO
	 * @author Jaden
	 * @date 2020年3月2日,上午11:16:50
	 * @copyright Jaden
	 */
	class RoleComparator_Attack implements Comparator<Role>{
		@Override
		public int compare(Role role1, Role role2) {
			if(role1.getAttack() > role2.getAttack()) return 1;
			if(role1.getAttack() < role2.getAttack()) return -1;
			return 0;
		}
	}
	
	
	
	
}
