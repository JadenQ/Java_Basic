
public class Array4Poker {

	public static void main(String[] args) {
		// 模拟扑克牌洗牌
		//know the color
		String[] Colors = {"♠","♥","♦","♣"};
		String[] Values = {"A","2","3","4","5",
				"6","7","8","9","10","J","Q","K"};
		// 0-51数字 /13：取得花色编号，%13可以得到牌面数字
		//定义 ： 0-12 黑桃，13-25红心，26-38方块，39-51梅花
		final int N = 52;
		int[] cards = new int[N];
		System.out.println("before:");
		for(int i = 0; i < cards.length; i++) {
			cards[i] = i;
			//print
			System.out.printf("%s%s",Colors[cards[i]/13],Values[cards[i]%13]);
			if((i + 1) % 6 == 0) {
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
		}
		//洗牌：随机生成newIndex,cards[i]与其交换
		for(int i = 0;i< cards.length; i++) {
			int newIndex = (int)(Math.random() * N); //0-51闅忔満鏁板瓧
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp; 
		}
		System.out.println("\n洗牌！");
		//print
		for(int i = 0; i< cards.length; i++) {
			//打印
			//System.out.print(cards[i]);
			System.out.printf("%s%s",Colors[cards[i]/13],Values[cards[i]%13]);
			if((i + 1) % 8 == 0) {
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
		}

	}

}
