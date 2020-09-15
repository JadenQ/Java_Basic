//ʹ�ýӿ�ʱ�ȵ��루����ͬһ�����
package printer;
import printer_iface.IPaper;
import printer_iface.iInkbox;

public class Printer {
	private iInkbox inkbox = null;
	private IPaper paper = null;
	
	
	
	/**
	 * ��ӡ������ʹ��ī�к�ֽ��
	 */
	public void print(String content) {
		if(null == inkbox || null == paper) {
			System.out.println("ī�л���ֽ���쳣�����飡");
			return;
		}
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("����������"+color+"ɫ");
		System.out.println("ʹ��ֽ��"+type);
		System.out.println("��ӡ����:"+ content);
		
	}



	public iInkbox getInkbox() {
		return inkbox;
	}



	public void setInkbox(iInkbox inkbox) {
		this.inkbox = inkbox;
	}



	public IPaper getPaper() {
		return paper;
	}



	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	
	
	
}
