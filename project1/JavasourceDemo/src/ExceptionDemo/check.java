package ExceptionDemo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class check {

	public static void main(String[] args) throws IOException {
		// TODO a case about checkedException
		File file = new File("d:/document/test.txt");
		FileWriter writer = new FileWriter(file);
		//��дtry-catch����throws�ᱨ���׳��쳣���Ƿ�ǿ�Ƽ��
		System.out.println(file.exists());
		//��Ȼû������ļ��������ļ��Ķ����Ѿ������ɹ���
		
		

	}

}
