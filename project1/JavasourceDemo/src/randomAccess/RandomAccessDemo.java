package randomAccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ʾRANDOMACCESSFILE�Ļ����÷�
 * @todo TODO
 * @author Jaden
 * @date 2020��2��21��,����9:40:06
 * @copyright Jaden
 */
public class RandomAccessDemo {
	private static final String FilePath1 = "src/randomAccess/rand.txt";
	private static final String FilePath2 = "src/randomAccess/163index.html";
	
	/**
	 * ʹ��random accessfileʵ���ļ��ĸ���
	 */
	private static void CopyFile() {
		try(
				RandomAccessFile srcFile = new RandomAccessFile(new File(FilePath2),"r");
				RandomAccessFile newFile = new RandomAccessFile(new File(FilePath1),"rw");				
				){
			//����֮ǰ���newFile
			newFile.setLength(0);
			long fileLen = srcFile.length(); //���Ҫ���Ƶ��ļ��Ĵ�С���ֽڣ�
			byte[] bytes = new byte[(int)fileLen]; //�����ֽ����飬�洢���Ƶ�����
			srcFile.readFully(bytes); //ȫ��һ�ζ�ȡ���ֽ����鵱��
			//�ֽ�����д���µ��ļ�
			newFile.write(bytes);
			System.out.println("���Ƴɹ�������");
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	public static void main(String[] args) throws IOException {
		CopyFile();//ʵ�ָ���
//		File file = new File(FilePath1);
//		if(!file.exists()) {
//			file.createNewFile();
//		}
//		// TODO Auto-generated method stub
//		try(RandomAccessFile randFile = new RandomAccessFile(new File(FilePath1), "rw")){
//			//��ȡ�ļ�����
//			randFile.setLength(0); // ǿ�����ļ���С���㣬�൱��ɾ��
//			//д��2000����������
//			for(int i = 0; i < 2000; i++) {
//				randFile.writeInt(i+2000);
//			}
//			//��ȡ���ƶ��ļ�ָ��
//			System.out.println("��ǰ�ļ���С��"+randFile.length()+"�ֽ�");
//			//�ƶ�ָ��
//			randFile.seek(4 * 8); //�ƶ�8�����οռ䣨32�ֽڣ�
//			System.out.println("�ƶ�8�����οռ�֮��"+ randFile.readInt());
//			//����8�������޸�Ϊ8000
//			randFile.writeInt(8000);
//			randFile.seek(4*800);//�ٴν�ָ���ƶ���800�����ʹ�
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
