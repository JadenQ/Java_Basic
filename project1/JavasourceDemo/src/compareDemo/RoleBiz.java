package compareDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * ��ɫ��ҵ����
 * @todo TODO
 * @author Jaden
 * @date 2020��3��2��,����10:13:41
 * @copyright Jaden
 */
public class RoleBiz {
	//Role[] roleArray = new Role[999];  ���������ַ���
	List<Role> roleList = null;
	//����һ���µ�arraylist
	public RoleBiz() {
		roleList = new ArrayList<>();
	}
	/**
	 * ��ӽ�ɫ����
	 * @param role
	 */
	public void add(Role role) {
		if(role != null) {
			roleList.add(role);
		}
	}
	/**
	 * ��ʾ��Ϣ
	 */
	public void show() {
		System.out.println("\n��ɫ\t�ƺ�\t��Ѫ\t������");
		System.out.println("-------------------------------");
		//ʹ�õ��������б�����ӡ
		Iterator<Role> roleIt = roleList.iterator();
		while(roleIt.hasNext()) {
			Role role = roleIt.next();
			System.out.println(role.getName()+"\t"+role.getTitle()+"\t"+role.getHp()+"\t"+role.getAttack());
		}
	}
	/**
	 * ɾ��һ��Ԫ�أ�������дequals�����������ڼ����п����ҳ�Ҫɾ����Ԫ��
	 * @param role
	 */
	public void delete(Role role) {
		roleList.remove(role);
	}
	
	/**
	 * ������Ľ�ɫ�����ڼ����н����޸�
	 * @param role
	 */
	public void update(Role role) {
		//1.�ڼ������ҵ��������:indexofʹ����equals����Ѱ��
		//2.�޸Ķ���
		int index = roleList.indexOf(role);
		if(index != -1) {
			roleList.set(index, role);
		}
	}
	
	/**
	 * ����ĳ�ֱȽ�ָ���������
	 */
	public void sort() {
	//1.�Լ�ʵ��ð�ݡ����롢����
	//2.ʹ�����õĹ������������ - ǰ�᣺����ʵ�ֱȽ����ӿ�
		//2-1.ʵ����ʵ��comparable�ӿ� Ҫʹ��collections.sort��Ҫ��role��ӿαȽ����ӿ�
		//��Ҫ��Role.java���޸�
//		Collections.sort(roleList);  //˳��
//		Collections.reverse(roleList);  //����
		//2-2.�Զ���һ���Ƚ����ӿڶ���:��ʹ��rolebiz.java�е�RoleComparator_(any)
		//˳��
	// Collections.sort(roleList, new RoleComparator_Attack());
		//����
		Collections.sort(roleList, Collections.reverseOrder(new RoleComparator_Attack()));
		Collections.shuffle(roleList); //����
	}
	/**
	 * ��ɫ���й������ıȽ���
	 * @todo TODO
	 * @author Jaden
	 * @date 2020��3��2��,����11:16:50
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
