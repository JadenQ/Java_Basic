
public class galaDancer extends galaActor{

	public galaDancer() {
		super();
	}
	//����Ƕ������Ҫ��name������
	public galaDancer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("�赸��Ա"+getName()+"�����赸��");
	}
	
	
	
}
