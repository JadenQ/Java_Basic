package ExceptionDemo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class check {

	public static void main(String[] args) throws IOException {
		// TODO a case about checkedException
		File file = new File("d:/document/test.txt");
		FileWriter writer = new FileWriter(file);
		//不写try-catch或者throws会报错：抛出异常：是否强制检测
		System.out.println(file.exists());
		//虽然没有这个文件，但是文件的对象已经创建成功了
		
		

	}

}
