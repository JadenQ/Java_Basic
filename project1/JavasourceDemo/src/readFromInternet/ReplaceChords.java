package readFromInternet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 一个文件读写操作：读入歌词、修改歌词、写出歌词---------字符流
 * @todo TODO
 * @author Jaden
 * @date 2020年2月19日,上午11:16:23
 * @copyright Jaden
 */
public class ReplaceChords {
	static final String Filepath = "src/lyrics/lyrics.sav";
	//标准写法：：：：//
//	public static void main(String[] args) {
//		//使用字符流进行操作
//		Reader reader = null;
//		BufferedReader bReader = null;
//		StringBuffer lyrics = new StringBuffer();
//		Writer writer = null;
//		BufferedWriter bWriter = null;
//		try {
//			reader = new FileReader(Filepath);
//			bReader = new BufferedReader(reader);
//			String line = null;  //用来保存读取出来的缓存数据
//			while((line = bReader.readLine())!=null) {
//				lyrics.append(line);
//				lyrics.append(System.getProperty("line.separator")); //添加分隔符
//			}
//			String newLyrics = lyrics.toString().replaceAll("E","F").replace("Am","Bm");
//			//将歌词写入文件
//			writer = new FileWriter(Filepath);
//			bWriter = new BufferedWriter(writer);
//			bWriter.write(newLyrics);
//			System.out.println("已经完成替换！");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				bReader.close();
//				reader.close();
//				bWriter.flush();
//				bWriter.close();
//				writer.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
	//写成方法：
	
	public static void  main(String[] args) {
		//调用方法获得文件中的内容
		String content = ReadFilebyReader(Filepath);
		//修改内容并写入到文件中
		WriteByPwriter(content, Filepath, true);
	}
	
	//使用printwriter,追加文件中的内容
	/**
	 * 使用Printwriter实现写入：代码简洁
	 * 类似于Scanner
	 * @param filepath
	 * @param isAppend
	 */
	public static void WriteByPwriter(String content,String filepath, boolean isAppend) {
		try(
				//JDK1.7之后的写法：可以自动关闭打开的资源： 因为implements了closable
				FileOutputStream outStream = new FileOutputStream(filepath,isAppend);
				PrintWriter writer = new PrintWriter(outStream);		
		){
			writer.print(content);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
				
	}
	
	//使用reader writer,读取上面的信息并追加
	public static String ReadFilebyReader(String filepath) {
		StringBuffer content = new StringBuffer();
		Reader reader = null;
		BufferedReader bReader = null;
		try {
			reader = new FileReader(Filepath);
			bReader = new BufferedReader(reader);
			String line = null;
			while((line = bReader.readLine())!=null) {
				content.append(line);
				content.append(System.getProperty("line.separator"));
			}
			//删除最后一个系统分隔符
			content.delete(content.toString().lastIndexOf(System.getProperty("line.separator")), content.toString().length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
				try {
					bReader.close();
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return content.toString();
		
	}
	
}
