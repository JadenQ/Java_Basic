package randomAccess;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// 下载的原理
// 当前的案例：从http协议下载文件
//1.从Http协议下载文件（文件流），将文件流以缓冲流的方式读取到内存中
//InputStream->BufferedInputStream
//2.缓存中的数据要分块写入硬盘：当前案例主要实现从http协议下载文件
//（randomaccessFile类可以使用指针去分块读入）
public class Downloader2 {
	//要下载的网址 146Mb
	static final String StrUrl = "http://gss3.baidu.com/6LZ0ej3k1Qd3ote6lo7D0j9wehsv/tieba-smallvideo-transcode/1920880_1e62f5c67de277c5f7285025a0363d5f_3.mp4";
	/**设置下载时候的默认缓存大小：1M  10K 每下载1M写入缓存*/
	private static final int MAX_BUFFER_SIZE = 4096;
	public static void main(String[] args) {
		//1.打开http链接，获得下载内容的长度（困难，但格式相对固定）
		//2.创建randomAccessFile对象
		//3，下载的内容缓存到字节数组中
		//4.。缓存的字节数组
		
		HttpURLConnection connection = null;
//		BufferedInputStream bInStream = null;
		InputStream inStream = null;
		int downloaded = 0; //已经下载的字节数：计算当前下载的百分比

		
		try {
			URL url = new URL(StrUrl);//创建Url对象，以便获得文件流
			connection = (HttpURLConnection)url.openConnection(); //connectiond对象
			//设置选项属性:range指的是下载的范围：连接请求
			connection.setRequestProperty("Range","bytes=0-");
			connection.connect(); //链接到服务器
			//判断是否成功：一般连接成功后，返回的代码应该在200范围内
			//1xx:表示请求已经被接受，2xx：成功！表示请求已经被理解和操作 3XX表示重定向，需要进一步操作 4XX客户端错误
			//5XX服务器错误
			//链接是否成功
			if(connection.getResponseCode() / 100 != 2) {
				System.err.println("连接的响应状态不再200范围内，连接错误，请重试！");
				return;
			}
			int filesize = connection.getContentLength(); //获得要下载的文件的大小（字节）
			inStream = connection.getInputStream();
			String fileName = url.getFile(); //返回下载的文件名
			fileName = fileName.substring(fileName.lastIndexOf("/")+1);//从最后一个斜线后面的字符串开始
			RandomAccessFile file = new RandomAccessFile(fileName,"rw"); //新建一个文件对象，用randomaccess
			
			
			file.setLength(0); //文件清空
			file.seek(0); //指针置零
			while(downloaded < filesize) {
				byte[] buffer = null;
				//判断未下载的大小是否超过最大缓存
				if(filesize - downloaded > MAX_BUFFER_SIZE) {
					buffer = new byte[MAX_BUFFER_SIZE]; //如果还剩很多没有下载完成，继续按照一个buffer大小下载
				}
				else {buffer = new byte[filesize - downloaded];} //否则将剩下的大小设置为一个buffer
				//将缓存中的内容读取出来
				int curDownload = 0; 
				int read = -1;  //实际下载的字节数
				long startTime = System.currentTimeMillis();
				while(curDownload<buffer.length) {
					read = inStream.read();
					if(read == -1) break; //下载完毕
					buffer[curDownload] = (byte)read; //未下载结束，将当前下载的字节数放置到缓存中
					curDownload++; //计算下载速度、								
				}
				long endTime = System.currentTimeMillis();
				if(read == -1) break;
				double speed = 0;
				if(endTime - startTime > 0) {
					speed = curDownload /1024.0/ ((double)(endTime - startTime)/1000); //计算速度
				}
				//将当前下载的缓存写入文件中去
				//先填满缓存再写入
				file.seek(downloaded);
				file.write(buffer);
				downloaded += curDownload;
				System.out.printf("当前下载速度：%.1f K/s,(%.1f M/s)\t当前下载进度:%.1f %%\n",speed,speed/1024.0,(float)(downloaded/filesize*100));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //创建url对象，获得文件流
		finally {
			connection.disconnect();
		}
	}

}
