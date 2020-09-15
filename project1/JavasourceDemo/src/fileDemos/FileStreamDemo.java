package fileDemos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 演示文件输入，输入流的基本用法
 * 可以实现剪切、复制的功能
 * @todo 是一种比较原始的读写方式，可以在这里熟悉InputStream,outputStream的常用方法
 * @author Jaden
 * @date 2020年1月16日,下午7:24:11
 * @copyright Jaden
 */
public class FileStreamDemo {
	//写在main方法外面的
	private static final String Filepath = "src/fileDemos/FileDemo1.java";
	
	
	public static void main(String[] args) throws IOException {
		
	
		Writefile();
	}
	//读文件fileinputStream输入的是文件对象/文件的路径
	public static void Readfile() throws IOException {
		//实例化一个file对象：
		File file = new File(Filepath); //省略是否为字符的判断
		//实例化一个Inputstream但是是一个抽象类，不能直接实例化
		//通过一个子类去完成实例化：FileInputStream
		InputStream inputStream = new FileInputStream(file);
		
		//读取文件的基本操作：相对比较固定
		//获取输入流可以读取的文件大小（字节）
		byte[] bytes = new byte[20000];
		inputStream.read(bytes); //read也使用了循环读取的方法
		inputStream.close();
		//循环读取
		//int count = 0;
		//对字节数逐个进行读入
//		while((bytes[count] = (byte)inputStream.read()) != -1) {
//			count++;
//		}
		String content = new String(bytes); //将整个字节s数组转换为字符串，以便于打印
		System.out.println(content);
	}
	//写文件fileoutputStream输入的是路径对象
	public static void Writefile() throws IOException {
		final String FilePath1 = "src/fileDemos/FileDemo2.java";
		//true:追加写入 false：覆盖
		OutputStream outStream = new FileOutputStream(FilePath1,true);
		String content = "public static aaaaa\n";
		content += "get more";
		//将字符串变成字节数组再写入文件中
		outStream.write(content.getBytes());
		outStream.close();
	}

}
