
public class galaDancer extends galaActor{

	public galaDancer() {
		super();
	}
	//如果是多变量，要让name进入吗
	public galaDancer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("舞蹈演员"+getName()+"正在舞蹈！");
	}
	
	
	
}
