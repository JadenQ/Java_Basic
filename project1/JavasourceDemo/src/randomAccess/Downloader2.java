package randomAccess;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// ���ص�ԭ��
// ��ǰ�İ�������httpЭ�������ļ�
//1.��HttpЭ�������ļ����ļ����������ļ����Ի������ķ�ʽ��ȡ���ڴ���
//InputStream->BufferedInputStream
//2.�����е�����Ҫ�ֿ�д��Ӳ�̣���ǰ������Ҫʵ�ִ�httpЭ�������ļ�
//��randomaccessFile�����ʹ��ָ��ȥ�ֿ���룩
public class Downloader2 {
	//Ҫ���ص���ַ 146Mb
	static final String StrUrl = "http://gss3.baidu.com/6LZ0ej3k1Qd3ote6lo7D0j9wehsv/tieba-smallvideo-transcode/1920880_1e62f5c67de277c5f7285025a0363d5f_3.mp4";
	/**��������ʱ���Ĭ�ϻ����С��1M  10K ÿ����1Mд�뻺��*/
	private static final int MAX_BUFFER_SIZE = 4096;
	public static void main(String[] args) {
		//1.��http���ӣ�����������ݵĳ��ȣ����ѣ�����ʽ��Թ̶���
		//2.����randomAccessFile����
		//3�����ص����ݻ��浽�ֽ�������
		//4.��������ֽ�����
		
		HttpURLConnection connection = null;
//		BufferedInputStream bInStream = null;
		InputStream inStream = null;
		int downloaded = 0; //�Ѿ����ص��ֽ��������㵱ǰ���صİٷֱ�

		
		try {
			URL url = new URL(StrUrl);//����Url�����Ա����ļ���
			connection = (HttpURLConnection)url.openConnection(); //connectiond����
			//����ѡ������:rangeָ�������صķ�Χ����������
			connection.setRequestProperty("Range","bytes=0-");
			connection.connect(); //���ӵ�������
			//�ж��Ƿ�ɹ���һ�����ӳɹ��󣬷��صĴ���Ӧ����200��Χ��
			//1xx:��ʾ�����Ѿ������ܣ�2xx���ɹ�����ʾ�����Ѿ������Ͳ��� 3XX��ʾ�ض�����Ҫ��һ������ 4XX�ͻ��˴���
			//5XX����������
			//�����Ƿ�ɹ�
			if(connection.getResponseCode() / 100 != 2) {
				System.err.println("���ӵ���Ӧ״̬����200��Χ�ڣ����Ӵ��������ԣ�");
				return;
			}
			int filesize = connection.getContentLength(); //���Ҫ���ص��ļ��Ĵ�С���ֽڣ�
			inStream = connection.getInputStream();
			String fileName = url.getFile(); //�������ص��ļ���
			fileName = fileName.substring(fileName.lastIndexOf("/")+1);//�����һ��б�ߺ�����ַ�����ʼ
			RandomAccessFile file = new RandomAccessFile(fileName,"rw"); //�½�һ���ļ�������randomaccess
			
			
			file.setLength(0); //�ļ����
			file.seek(0); //ָ������
			while(downloaded < filesize) {
				byte[] buffer = null;
				//�ж�δ���صĴ�С�Ƿ񳬹���󻺴�
				if(filesize - downloaded > MAX_BUFFER_SIZE) {
					buffer = new byte[MAX_BUFFER_SIZE]; //�����ʣ�ܶ�û��������ɣ���������һ��buffer��С����
				}
				else {buffer = new byte[filesize - downloaded];} //����ʣ�µĴ�С����Ϊһ��buffer
				//�������е����ݶ�ȡ����
				int curDownload = 0; 
				int read = -1;  //ʵ�����ص��ֽ���
				long startTime = System.currentTimeMillis();
				while(curDownload<buffer.length) {
					read = inStream.read();
					if(read == -1) break; //�������
					buffer[curDownload] = (byte)read; //δ���ؽ���������ǰ���ص��ֽ������õ�������
					curDownload++; //���������ٶȡ�								
				}
				long endTime = System.currentTimeMillis();
				if(read == -1) break;
				double speed = 0;
				if(endTime - startTime > 0) {
					speed = curDownload /1024.0/ ((double)(endTime - startTime)/1000); //�����ٶ�
				}
				//����ǰ���صĻ���д���ļ���ȥ
				//������������д��
				file.seek(downloaded);
				file.write(buffer);
				downloaded += curDownload;
				System.out.printf("��ǰ�����ٶȣ�%.1f K/s,(%.1f M/s)\t��ǰ���ؽ���:%.1f %%\n",speed,speed/1024.0,(float)(downloaded/filesize*100));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //����url���󣬻���ļ���
		finally {
			connection.disconnect();
		}
	}

}
