package booksystem.biz;

import booksystem.biz.implement.BookInfoBizImp1;
import booksystem.biz.implement.UserBizImp1;

/**
 * ҵ�񹤳���
 * @todo TODO
 * @author Jaden
 * @date 2020��3��17��,����9:02:17
 * @copyright Jaden
 */
public class BizFactory {
	/**
	 * ����ҵ��������ƣ������Ӧ��ҵ����ʵ��
	 * ����һ���ַ������õ�һ��ҵ���෽��
	 * @param bizName
	 * @return
	 */
	public static Biz getBiz(String bizName) {
		//Ϊ��ͳһСд
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
