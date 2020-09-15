import javax.swing.JOptionPane;

//管理商品

public class Class5_ProductMg {
	public static void main(String[] args) {
		//counts用来保存三种商品，每种商品的总量
		int[] counts = new int[3]; 
		double total = 0; //总金额
		//对象数组只保存了地址名字，没有分配空间，要在循环内分配空间
		Class5_Product[] product = new Class5_Product[3];
		for(int i = 0; i <counts.length; i++) {
			//下面的对象元素product仅存在循环内，可以在循环外声明对象数组
			//Class5_Product product = new Class5_Product();
			if(product[i] == null) //如果空间真的还没有分配
				product[i] = new Class5_Product();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			product[i].setName(name);
			//接受用户输入的商品单价，输出为字符型
			String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
			//转换为double
			//利用包装类
			double price = Double.parseDouble(strPrice);
			product[i].setPrice(price);
			String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
			counts[i] = Integer.parseInt(strCount);
			
			//累加
			total += product[i].getPrice()*counts[i];
		}
		
		
		
//		for(int i = 0; i <counts.length; i++) {
//			//下面的对象元素product仅存在循环内，可以在循环外声明对象数组
//			Class5_Product product = new Class5_Product();
//			String name = JOptionPane.showInputDialog("请输入商品名称：");
//			product.setName(name);
//			//接受用户输入的商品单价，输出为字符型
//			String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
//			//转换为double
//			//利用包装类
//			double price = Double.parseDouble(strPrice);
//			product.setPrice(price);
//			String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
//			counts[i] = Integer.parseInt(strCount);
//			
//			//累加
//			total += product.getPrice()*counts[i];
//		}
		
		System.out.println("购物结算：");
		for(int i = 0; i< product.length;i++) {
			System.out.println(product[i].getName()+"\t单价为："+product[i].getPrice()+"\t购买件数："+counts[i]);
		}
		System.out.println("商品金额为："+ total);
	}
}
