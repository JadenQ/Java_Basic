package printer;

import printer_iface.IPaper;
import printer_realizeClasses.ColorIBImp;
import printer_realizeClasses.A4Paper;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.setInkbox(new ColorIBImp());
		printer.setPaper(new A4Paper()); 
		
		printer.print("²âÊÔÄÚÈİ");
	}

}
