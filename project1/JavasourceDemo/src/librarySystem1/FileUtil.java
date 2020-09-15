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
 * �ļ������࣬�������ļ��Ķ�д��̬����������ʹ��
 * �����ļ�����������Ϣ�ֱ�set����ͬ����Ϣ��ȥ
 * @todo TODO
 * @author Jaden
 * @date 2020��2��28��,����10:11:13
 * @copyright Jaden
 */
public class FileUtil {
	/**
	 * �������ж�д������ͼ����Ϣ�ļ�·��
	 */
	private static final String BookFile = "src/librarySystem1/bookInfo.dat";
	//�����ָ����Եķָ�����Ĭ��Ӣ�Ķ���//�����ָ��еķָ�������ϵͳ�Դ�
	private static final String SepAttr = ","; 
	private static final String SepLine = System.getProperty("line.separator");
	
	/**
	 * �������ͼ���������д���ļ���
	 * �����������Ὣͼ��ֿ������е�����ȫ�µ�д�뵽�ļ��У����ǲ�����
	 * @param booksArray
	 */
	public static void SaveBooks(Book ...booksArray) {
		if(booksArray == null || booksArray.length == 0) return;
		BookBiz bookbiz = new BookBiz();
		File bookFile = new File(BookFile);
		//�Ƿ����
		if(!bookFile.exists()) {
			try {
				bookFile.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
			try(
				//�ֽ�����FileOutputStream   �ַ��� FileWriter
					//BufferOutpuStream   �ַ�����BufferedWriter
				FileWriter fOut = new FileWriter(bookFile,false);	
				BufferedWriter out = new BufferedWriter(fOut);
					){
				//ʵ�ּ򵥵�����ƴ��
				StringBuffer content = new StringBuffer();
				int bookCount = bookbiz.getBookCount(); //��ô���ͼ�������е�ͼ��������������null��
				//ֱ�Ӱѳ���Ϊ999�Ķ������鴦���ȥ��
				for(int i = 0; i<bookCount; i++) {
					content.append(booksArray[i].getBookID());
					content.append(SepAttr);
					content.append(booksArray[i].getBookName());
					content.append(SepAttr);
					content.append(booksArray[i].getCount());
					content.append(SepLine);
				}
				//���ַ���д���ļ���
				out.write(content.toString());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * ���ļ��ж�ȡ���ݣ����������в�⣬�������ϳɶ��󡢶������鲢����
	 * @return
	 */
	public static Book[] LoadBooks() {
		File bookfile = new File(BookFile);
		if(!bookfile.exists()) return null;
		//���ʹ�ö�̬����
		Book[] booksArray = new Book[999]; //��ȡ��ʱ�����ֻ�ܶ�ȡ999��ͼ�����
		try(FileReader fReader = new FileReader(BookFile);
				BufferedReader reader = new BufferedReader(fReader);
				){
			String line = null;
			int count = 0;
			//�жϵ���һ�в��ǿ�ֵ
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
