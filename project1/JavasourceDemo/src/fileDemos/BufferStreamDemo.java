package fileDemos;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferStreamDemo {

	/**
	 * 新的尝试使用的filepath
	 * 文件路径在本电脑中,实现复制粘贴功能！！！！！！
	 */
	public static final String FilePath1 = "D:\\document\\code\\Java_T\\lecture\\project1\\JavasourceDemo\\src\\fileDemos\\angle.jpg";
	public static final String FilePath2 = "D:\\document\\code\\Java_T\\lecture\\project1\\JavasourceDemo\\src\\fileDemos\\angle-copy.jpg";
	
	/**
	 * 旧的尝试使用的filepath
	 * @param args
	 * @throws IOException
	 */
//	static final String FilePath1 = "src/fileDemos/FileStreamDemo.java";
//	static final String FilePath2 = "src/fileDemos/BufferTest.txt";
	public static void main(String[] args) throws IOException {
	long time = CopyFileBuffered();
	System.out.println("copy time " + time +"ms");
	
	/**
	 * 新的尝试:进行输入输出
	 */
//	BufferedInputStream inStream = new BufferedInputStream(System.in);
//	byte[] bytes = new byte[200];
//	System.out.println("请输入字符串");
//	inStream.read(bytes);
//	System.out.println("用户输入的字符串为："+ new String(bytes));
		
	/**
	 * 旧的尝试
	 */
//	//used to create a file and input stream
//		FileInputStream fInpStream = null;
//		BufferedInputStream bInpStream = null;
//		// 利用buffer提高读入效率
//		try {
//			fInpStream = new FileInputStream(FilePath1);
//			//可以在调用bufferedINPUTsTREAM的时候输入缓存的大小，缓存是一个字节数组
//			bInpStream = new BufferedInputStream(fInpStream);
//			//缓存数组,利用available取出适合的长度
//			byte[] bytes = new byte[bInpStream.available()];
//			//读、
//			bInpStream.read(bytes);
//			System.out.println(new String(bytes));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				//close the objects respectively : file & buffers
//				fInpStream.close();
//				bInpStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	//output 写出
//		//用字节流读写文本文件 （并不常用）
//	BufferedOutputStream bOStream = null;
//	try {
//		bOStream = new BufferedOutputStream(new FileOutputStream(FilePath2),10240);
//		bOStream.write("Today is a good day!".getBytes());
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	finally {
//		//如果不关闭，无法成功写入
//		try {
//			bOStream.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		
	}
	/**
	 * 使用缓存流拷贝文件
	 * @return 拷贝过程的用时
	 * @throws FileNotFoundException 
	 */
	private static long CopyFileBuffered() throws FileNotFoundException {
		File file = new File(FilePath1);
		if(!file.exists()) {
			System.out.println("文件不存在，复制失败");
			return 0;
		}
		
		long startTime = System.currentTimeMillis();
		InputStream inStream = null;
		BufferedInputStream bInStream = null;
		OutputStream outStream = null;
		BufferedOutputStream boutStream = null;
		//不经常使用如下的写法，因为后面还要进行关闭
				//InputStream inStream = new FileInputStream(file);
		inStream = new FileInputStream(file);
		//装饰器buffer
		bInStream = new BufferedInputStream(inStream);
		outStream = new FileOutputStream(FilePath2);
		boutStream = new BufferedOutputStream(outStream);
		//读取出的临时变量
		int i = -1;
		try {
			while((i = bInStream.read()) != -1) {
				boutStream.write(i); // 注意：读取一个字节，就写入缓存中
				//最后将缓冲区中的内容写到文件中去
				//也就是清空缓冲区，将缓冲区写到文件中-flush()
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				boutStream.flush();//清空缓冲区（但是close内部已经自动调用了flush）
				boutStream.close();//关闭对象(先创立的最后关)
				outStream.close();
				bInStream.close();
				inStream.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
}

//使用FileinputStream 实现文件的复制
//查看复制所用的时间，对比使用缓存的好处
//不同缓存大小，体会效率的区别
