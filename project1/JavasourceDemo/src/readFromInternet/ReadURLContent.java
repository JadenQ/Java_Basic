package readFromInternet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * ��URL�����ȡ�ļ����ݣ����ڽ�֧��http
 * @todo TODO
 * @author Jaden
 * @date 2020��2��20��,����10:45:11
 * @copyright Jaden
 */
public class ReadURLContent {
	static final String FilePath = "src/readFromInternet/163index.html";
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.163.com/index.html");
		//��inputstreamת����reader ʹ��װ����
		StringBuffer content = new StringBuffer();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
			String line = null;
			
			while((line = reader.readLine())!=null) {
				//ÿ�����붼��ӡ System.out.println(line);
				//���û��棬������ٴ�ӡ
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
