/**
 * 
 * @todo TODO �����
 * @author Jaden
 * @date 2019��12��2��,����10:36:41
 * @copyright Jaden
 */
public class Method3CallNames {

	public static void main(String[] args) {
		// 
		SendMessage("���޼�", "�",
				"����ߴ��", 
				5, 2);
		SendMessage("Jaden");

	}
	
	/**
	 * ���صĺ���������ֻ��Ҫ�������֣�Ҳ����
	 * @param Nicname ����ֻ������������
	 */
	public static void SendMessage(String Nicname) {
		String[] contents = {"hi","this","button"};
		SendMessage(Nicname,"default","no!",2,2);
	}
	
	
	
	/**
	 * ʵ����Ϸ�к�������
	 * @param name ����������
	 * @param channelNamme ����Ƶ������
	 * @param message ����������
	 * @param count �����Ĵ���
	 * @param interval �������:s
	 */
	public static void SendMessage(String name, String channelName, String message,int count, int interval) {
	
	//����intervalʱ��
		if(interval < 2) interval = 2;
	String value = String.format("��%s��%s:%s",channelName,name,message);
		for(int i = 0; i < count; i++) {
			System.out.println(value);//���count�Σ�ÿ������interval��
			try {
				Thread.sleep(interval*1000);
				//TimeUnit.SECONDS.sleep(interval); //ͬ��Ҳ������thread.sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
