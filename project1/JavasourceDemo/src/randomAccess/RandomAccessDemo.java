package randomAccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 演示RANDOMACCESSFILE的基本用法
 * @todo TODO
 * @author Jaden
 * @date 2020年2月21日,上午9:40:06
 * @copyright Jaden
 */
public class RandomAccessDemo {
	private static final String FilePath1 = "src/randomAccess/rand.txt";
	private static final String FilePath2 = "src/randomAccess/163index.html";
	
	/**
	 * 使用random accessfile实现文件的复制
	 */
	private static void CopyFile() {
		try(
				RandomAccessFile srcFile = new RandomAccessFile(new File(FilePath2),"r");
				RandomAccessFile newFile = new RandomAccessFile(new File(FilePath1),"rw");				
				){
			//复制之前清空newFile
			newFile.setLength(0);
			long fileLen = srcFile.length(); //获得要复制的文件的大小（字节）
			byte[] bytes = new byte[(int)fileLen]; //构建字节数组，存储复制的内容
			srcFile.readFully(bytes); //全部一次读取到字节数组当中
			//字节数组写入新的文件
			newFile.write(bytes);
			System.out.println("复制成功！！！");
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	public static void main(String[] args) throws IOException {
		CopyFile();//实现复制
//		File file = new File(FilePath1);
//		if(!file.exists()) {
//			file.createNewFile();
//		}
//		// TODO Auto-generated method stub
//		try(RandomAccessFile randFile = new RandomAccessFile(new File(FilePath1), "rw")){
//			//读取文件内容
//			randFile.setLength(0); // 强制令文件大小归零，相当于删除
//			//写入2000个整形数据
//			for(int i = 0; i < 2000; i++) {
//				randFile.writeInt(i+2000);
//			}
//			//读取：移动文件指针
//			System.out.println("当前文件大小："+randFile.length()+"字节");
//			//移动指针
//			randFile.seek(4 * 8); //移动8个整形空间（32字节）
//			System.out.println("移动8个整形空间之后"+ randFile.readInt());
//			//将第8个整型修改为8000
//			randFile.writeInt(8000);
//			randFile.seek(4*800);//再次将指针移动到800个整型处
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
