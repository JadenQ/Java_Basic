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
 * һ���ļ���д�����������ʡ��޸ĸ�ʡ�д�����---------�ַ���
 * @todo TODO
 * @author Jaden
 * @date 2020��2��19��,����11:16:23
 * @copyright Jaden
 */
public class ReplaceChords {
	static final String Filepath = "src/lyrics/lyrics.sav";
	//��׼д����������//
//	public static void main(String[] args) {
//		//ʹ���ַ������в���
//		Reader reader = null;
//		BufferedReader bReader = null;
//		StringBuffer lyrics = new StringBuffer();
//		Writer writer = null;
//		BufferedWriter bWriter = null;
//		try {
//			reader = new FileReader(Filepath);
//			bReader = new BufferedReader(reader);
//			String line = null;  //���������ȡ�����Ļ�������
//			while((line = bReader.readLine())!=null) {
//				lyrics.append(line);
//				lyrics.append(System.getProperty("line.separator")); //��ӷָ���
//			}
//			String newLyrics = lyrics.toString().replaceAll("E","F").replace("Am","Bm");
//			//�����д���ļ�
//			writer = new FileWriter(Filepath);
//			bWriter = new BufferedWriter(writer);
//			bWriter.write(newLyrics);
//			System.out.println("�Ѿ�����滻��");
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
	//д�ɷ�����
	
	public static void  main(String[] args) {
		//���÷�������ļ��е�����
		String content = ReadFilebyReader(Filepath);
		//�޸����ݲ�д�뵽�ļ���
		WriteByPwriter(content, Filepath, true);
	}
	
	//ʹ��printwriter,׷���ļ��е�����
	/**
	 * ʹ��Printwriterʵ��д�룺������
	 * ������Scanner
	 * @param filepath
	 * @param isAppend
	 */
	public static void WriteByPwriter(String content,String filepath, boolean isAppend) {
		try(
				//JDK1.7֮���д���������Զ��رմ򿪵���Դ�� ��Ϊimplements��closable
				FileOutputStream outStream = new FileOutputStream(filepath,isAppend);
				PrintWriter writer = new PrintWriter(outStream);		
		){
			writer.print(content);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
				
	}
	
	//ʹ��reader writer,��ȡ�������Ϣ��׷��
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
			//ɾ�����һ��ϵͳ�ָ���
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
