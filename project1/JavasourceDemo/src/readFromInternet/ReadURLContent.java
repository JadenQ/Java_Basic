package readFromInternet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * 从URL上面读取文件内容，现在仅支持http
 * @todo TODO
 * @author Jaden
 * @date 2020年2月20日,上午10:45:11
 * @copyright Jaden
 */
public class ReadURLContent {
	static final String FilePath = "src/readFromInternet/163index.html";
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.163.com/index.html");
		//将inputstream转换成reader 使用装饰器
		StringBuffer content = new StringBuffer();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
			String line = null;
			
			while((line = reader.readLine())!=null) {
				//每次输入都打印 System.out.println(line);
				//利用缓存，添加完再打印
				content.append(line);
				content.append(System.getProperty("line separator"));
			}
			ReplaceChords.WriteByPwriter(content.toString(), FilePath, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
