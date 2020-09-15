package booksystem.biz;

import booksystem.biz.implement.BookInfoBizImp1;
import booksystem.biz.implement.UserBizImp1;

/**
 * 业务工厂类
 * @todo TODO
 * @author Jaden
 * @date 2020年3月17日,上午9:02:17
 * @copyright Jaden
 */
public class BizFactory {
	/**
	 * 根据业务类的名称，获得相应的业务类实现
	 * 输入一个字符串，得到一个业务类方法
	 * @param bizName
	 * @return
	 */
	public static Biz getBiz(String bizName) {
		//为了统一小写
		switch (bizName.toLowerCase()) {
		case "bookinfobiz":
			return new BookInfoBizImp1();
		case "userbiz":
			return new UserBizImp1();
		default:
			return null;
		}
	}
}
