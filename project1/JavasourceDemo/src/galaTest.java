
public class galaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		galaDerictor 张艺谋 = new galaDerictor();
		galaSinger 宋祖英 = new galaSinger("宋祖英");
		galaDancer 杨丽萍 = new galaDancer("杨丽萍");
		//实例化父类对象，有时候并不完善 将父类加”abstract“抽象化父类（概念）
		//galaActor Secretactor = new galaActor("吴宗宪");
		
		张艺谋.action(宋祖英);
		张艺谋.action(杨丽萍);
		//张艺谋.action(Secretactor);
		
		
		//升级：添加相声演员，核心业务代码功能不变
	}

}
