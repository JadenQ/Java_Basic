package compareDemo;

public class RoleTest {

	public static void main(String[] args) {
		// ����
		RoleBiz biz = new RoleBiz();
		biz.add(new Role("LiU","GAGA",130,19));
		biz.add(new Role("EU","TRGA",360,659));
		biz.add(new Role("ADF","GGA",40,29));
		biz.add(new Role("GAG","AFA",20,109));

		biz.show();
		
//		//ɾ�����е�һ��Ԫ��
//		Role role1 = new Role("LiU","GAGA",30,19);
//		biz.delete(role1);
		//�޸�
//		Role role1 = new Role("LiU","GA",30,20);
//		biz.update(role1);
//		biz.show();
		//����
		System.out.println("sorting:");
		biz.sort();
		biz.show();
		
		
		
	}

}
