import java.util.Scanner; 

public class ShoppingTime {

	public static void main(String[] args) {
		// TODO 打折季
		Scanner input = new Scanner(System.in);
		//输入商品的单价和数量
		double price, total; //单价，总价
		int count;//数量
		double discount = 1; //折扣
		System.out.print("路易斯威登手表单价：");
		price = input.nextDouble();
		System.out.print("路易斯威登手表数量：");
		count = input.nextInt();
		total = price*count;
		System.out.print("爱马仕皮带单价：");
		price = input.nextDouble();
		System.out.print("爱马仕皮带数量：");
		count = input.nextInt();
		total += price*count;
		System.out.print("香奈儿香水单价：");
		price = input.nextDouble();
		System.out.print("香奈儿香水数量：");
		count = input.nextInt();
		total += price*count;
		//计算总价
		System.out.println("总价："+total);
		//判断折扣情况
		if(total >=50000) {
			discount *= 0.7;
		}
		else {discount *= 0.9;}
		
		//打印该支付的金额
		System.out.println("折后价格："+total*discount+"\t"+"折扣："+(total-total*discount));

	}

}
