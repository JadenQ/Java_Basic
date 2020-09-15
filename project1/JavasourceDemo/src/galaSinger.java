
public class galaSinger extends galaActor {
	
	//继承父类构造
	public galaSinger() {
		super();
	}
	
	public galaSinger(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("歌唱家"+getName()+"正在表演一首美妙的歌曲，一起欣赏");
	}


	
	
}
