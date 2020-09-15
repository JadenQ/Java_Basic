package librarySystem1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 文件工具类，包含对文件的读写静态方法，方便使用
 * 读出文件。将内容信息分别set到不同的信息上去
 * @todo TODO
 * @author Jaden
 * @date 2020年2月28日,上午10:11:13
 * @copyright Jaden
 */
public class FileUtil {
	/**
	 * 用来进行读写操作的图书信息文件路径
	 */
	private static final String BookFile = "src/librarySystem1/bookInfo.dat";
	//用来分隔属性的分隔符，默认英文逗号//用来分隔行的分隔符，，系统自带
	private static final String SepAttr = ","; 
	private static final String SepLine = System.getProperty("line.separator");
	
	/**
	 * 将传入的图书对象数组写入文件中
	 * ！：本方法会将图书仓库数据中的内容全新地写入到文件中（覆盖操作）
	 * @param booksArray
	 */
	public static void SaveBooks(Book ...booksArray) {
		if(booksArray == null || booksArray.length == 0) return;
		BookBiz bookbiz = new BookBiz();
		File bookFile = new File(BookFile);
		//是否存在
		if(!bookFile.exists()) {
			try {
				bookFile.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
			try(
				//字节流：FileOutputStream   字符流 FileWriter
					//BufferOutpuStream   字符流：BufferedWriter
				FileWriter fOut = new FileWriter(bookFile,false);	
				BufferedWriter out = new BufferedWriter(fOut);
					){
				//实现简单地属性拼接
				StringBuffer content = new StringBuffer();
				int bookCount = bookbiz.getBookCount(); //获得传入图书数组中的图书对象个数（不是null）
				//直接把长度为999的对象数组处理进去了
				for(int i = 0; i<bookCount; i++) {
					content.append(booksArray[i].getBookID());
					content.append(SepAttr);
					content.append(booksArray[i].getBookName());
					content.append(SepAttr);
					content.append(booksArray[i].getCount());
					content.append(SepLine);
				}
				//将字符串写入文件中
				out.write(content.toString());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * 从文件中读取内容，将内容逐行拆解，重新整合成对象、对象数组并返回
	 * @return
	 */
	public static Book[] LoadBooks() {
		File bookfile = new File(BookFile);
		if(!bookfile.exists()) return null;
		//最好使用动态数组
		Book[] booksArray = new Book[999]; //读取的时候，最多只能读取999个图书对象
		try(FileReader fReader = new FileReader(BookFile);
				BufferedReader reader = new BufferedReader(fReader);
				){
			String line = null;
			int count = 0;
			//判断当第一行不是空值
			while((line = reader.readLine())!=null) {
				Book curBook = new Book();
				String[] attrs = line.split(SepAttr);
				curBook.setBookID(attrs[0].trim());
				curBook.setBookName(attrs[1].trim());
				curBook.setCount(Integer.parseInt(attrs[2].trim()));
				booksArray[count] = curBook;
				count++;
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		retrun booksArray;
		
		
	}
	
}
