package fileDemos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * ��ʾ�ļ����룬�������Ļ����÷�
 * ����ʵ�ּ��С����ƵĹ���
 * @todo ��һ�ֱȽ�ԭʼ�Ķ�д��ʽ��������������ϤInputStream,outputStream�ĳ��÷���
 * @author Jaden
 * @date 2020��1��16��,����7:24:11
 * @copyright Jaden
 */
public class FileStreamDemo {
	//д��main���������
	private static final String Filepath = "src/fileDemos/FileDemo1.java";
	
	
	public static void main(String[] args) throws IOException {
		
	
		Writefile();
	}
	//���ļ�fileinputStream��������ļ�����/�ļ���·��
	public static void Readfile() throws IOException {
		//ʵ����һ��file����
		File file = new File(Filepath); //ʡ���Ƿ�Ϊ�ַ����ж�
		//ʵ����һ��Inputstream������һ�������࣬����ֱ��ʵ����
		//ͨ��һ������ȥ���ʵ������FileInputStream
		InputStream inputStream = new FileInputStream(file);
		
		//��ȡ�ļ��Ļ�����������ԱȽϹ̶�
		//��ȡ���������Զ�ȡ���ļ���С���ֽڣ�
		byte[] bytes = new byte[20000];
		inputStream.read(bytes); //readҲʹ����ѭ����ȡ�ķ���
		inputStream.close();
		//ѭ����ȡ
		//int count = 0;
		//���ֽ���������ж���
//		while((bytes[count] = (byte)inputStream.read()) != -1) {
//			count++;
//		}
		String content = new String(bytes); //�������ֽ�s����ת��Ϊ�ַ������Ա��ڴ�ӡ
		System.out.println(content);
	}
	//д�ļ�fileoutputStream�������·������
	public static void Writefile() throws IOException {
		final String FilePath1 = "src/fileDemos/FileDemo2.java";
		//true:׷��д�� false������
		OutputStream outStream = new FileOutputStream(FilePath1,true);
		String content = "public static aaaaa\n";
		content += "get more";
		//���ַ�������ֽ�������д���ļ���
		outStream.write(content.getBytes());
		outStream.close();
	}

}
