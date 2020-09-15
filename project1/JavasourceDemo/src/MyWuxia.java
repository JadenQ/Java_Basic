import java.util.Scanner;

/**
 * 
 * @todo 我的武侠世界 模拟人物选择功能
 * @author Jaden
 * @date 2019年11月24日,下午1:40:41
 * @copyright Jaden
 */
public class MyWuxia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";
		String name = null;
		do {
			System.out.println("welcome to 武侠世界，起名字吧");
			name = input.nextLine();
			System.out.println("头衔：【初入江湖】"+name);
			System.out.println("满意这个名字？（y/n）"+name);
			answer = input.nextLine();
		}
		while(!answer.contentEquals("y"));
		// 忽略大小写区别：while(answer.equalsIgnoreCase("y"));
		// 如果y是常量 ,比较： while("y".equalsIgnoreCase(answer))
		
		System.out.printf("[%s]大侠来啦\n",name);
		
		input.close();
	}
}
