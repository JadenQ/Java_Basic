/**
 * 
 * @todo TODO 喊大家
 * @author Jaden
 * @date 2019年12月2日,上午10:36:41
 * @copyright Jaden
 */
public class Method3CallNames {

	public static void main(String[] args) {
		// 
		SendMessage("张无忌", "深海",
				"来这边打架", 
				5, 2);
		SendMessage("Jaden");

	}
	
	/**
	 * 重载的喊话方法，只需要输入名字，也可以
	 * @param Nicname 可以只输入任务名字
	 */
	public static void SendMessage(String Nicname) {
		String[] contents = {"hi","this","button"};
		SendMessage(Nicname,"default","no!",2,2);
	}
	
	
	
	/**
	 * 实现游戏中喊话功能
	 * @param name 喊话者名称
	 * @param channelNamme 喊话频道名称
	 * @param message 喊话的内容
	 * @param count 喊话的次数
	 * @param interval 喊话间隔:s
	 */
	public static void SendMessage(String name, String channelName, String message,int count, int interval) {
	
	//限制interval时长
		if(interval < 2) interval = 2;
	String value = String.format("【%s】%s:%s",channelName,name,message);
		for(int i = 0; i < count; i++) {
			System.out.println(value);//输出count次，每次休眠interval秒
			try {
				Thread.sleep(interval*1000);
				//TimeUnit.SECONDS.sleep(interval); //同样也调用了thread.sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
