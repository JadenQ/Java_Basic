//使用接口时先导入（不在同一个包里）
package printer;
import printer_iface.IPaper;
import printer_iface.iInkbox;

public class Printer {
	private iInkbox inkbox = null;
	private IPaper paper = null;
	
	
	
	/**
	 * 打印方法，使用墨盒和纸张
	 */
	public void print(String content) {
		if(null == inkbox || null == paper) {
			System.out.println("墨盒或者纸张异常，请检查！");
			return;
		}
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("以下文字是"+color+"色");
		System.out.println("使用纸张"+type);
		System.out.println("打印内容:"+ content);
		
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
