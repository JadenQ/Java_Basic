package printer_realizeClasses;
import printer_iface.IPaper;

public class A4Paper implements IPaper{
	@Override
	public String getSize() {
		return "a4";
	}
}
