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
	 * �µĳ���ʹ�õ�filepath
	 * �ļ�·���ڱ�������,ʵ�ָ���ճ�����ܣ�����������
	 */
	public static final String FilePath1 = "D:\\document\\code\\Java_T\\lecture\\project1\\JavasourceDemo\\src\\fileDemos\\angle.jpg";
	public static final String FilePath2 = "D:\\document\\code\\Java_T\\lecture\\project1\\JavasourceDemo\\src\\fileDemos\\angle-copy.jpg";
	
	/**
	 * �ɵĳ���ʹ�õ�filepath
	 * @param args
	 * @throws IOException
	 */
//	static final String FilePath1 = "src/fileDemos/FileStreamDemo.java";
//	static final String FilePath2 = "src/fileDemos/BufferTest.txt";
	public static void main(String[] args) throws IOException {
	long time = CopyFileBuffered();
	System.out.println("copy time " + time +"ms");
	
	/**
	 * �µĳ���:�����������
	 */
//	BufferedInputStream inStream = new BufferedInputStream(System.in);
//	byte[] bytes = new byte[200];
//	System.out.println("�������ַ���");
//	inStream.read(bytes);
//	System.out.println("�û�������ַ���Ϊ��"+ new String(bytes));
		
	/**
	 * �ɵĳ���
	 */
//	//used to create a file and input stream
//		FileInputStream fInpStream = null;
//		BufferedInputStream bInpStream = null;
//		// ����buffer��߶���Ч��
//		try {
//			fInpStream = new FileInputStream(FilePath1);
//			//�����ڵ���bufferedINPUTsTREAM��ʱ�����뻺��Ĵ�С��������һ���ֽ�����
//			bInpStream = new BufferedInputStream(fInpStream);
//			//��������,����availableȡ���ʺϵĳ���
//			byte[] bytes = new byte[bInpStream.available()];
//			//����
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
//	//output д��
//		//���ֽ�����д�ı��ļ� ���������ã�
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
//		//������رգ��޷��ɹ�д��
//		try {
//			bOStream.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		
	}
	/**
	 * ʹ�û����������ļ�
	 * @return �������̵���ʱ
	 * @throws FileNotFoundException 
	 */
	private static long CopyFileBuffered() throws FileNotFoundException {
		File file = new File(FilePath1);
		if(!file.exists()) {
			System.out.println("�ļ������ڣ�����ʧ��");
			return 0;
		}
		
		long startTime = System.currentTimeMillis();
		InputStream inStream = null;
		BufferedInputStream bInStream = null;
		OutputStream outStream = null;
		BufferedOutputStream boutStream = null;
		//������ʹ�����µ�д������Ϊ���滹Ҫ���йر�
				//InputStream inStream = new FileInputStream(file);
		inStream = new FileInputStream(file);
		//װ����buffer
		bInStream = new BufferedInputStream(inStream);
		outStream = new FileOutputStream(FilePath2);
		boutStream = new BufferedOutputStream(outStream);
		//��ȡ������ʱ����
		int i = -1;
		try {
			while((i = bInStream.read()) != -1) {
				boutStream.write(i); // ע�⣺��ȡһ���ֽڣ���д�뻺����
				//��󽫻������е�����д���ļ���ȥ
				//Ҳ������ջ���������������д���ļ���-flush()
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				boutStream.flush();//��ջ�����������close�ڲ��Ѿ��Զ�������flush��
				boutStream.close();//�رն���(�ȴ���������)
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

//ʹ��FileinputStream ʵ���ļ��ĸ���
//�鿴�������õ�ʱ�䣬�Ա�ʹ�û���ĺô�
//��ͬ�����С�����Ч�ʵ�����
