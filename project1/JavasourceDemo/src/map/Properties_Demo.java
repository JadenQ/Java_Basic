package map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class Properties_Demo {

	public static void main(String[] args) throws IOException {
		//��ȡproperties�ļ��ĳ��÷���//��Ϊ�ļ��ڲ�ͬ�豸��·����ͬ
		Properties props = new Properties();
		//���������ļ� - �̶�д��
		//����һ����
			props.load(Properties_Demo.class.getResourceAsStream("Config.properties"));
			//�����ڼ�ֵ����
			
		//��ȡ����
			//����user��ֵ�����û��ֵ�򷵻�abc
			String value = props.getProperty("user","abc");
			System.out.println(value);
		//�������ļ���д������:Ӧ�������binĿ¼
			props.setProperty("name", "Monkey");
			props.setProperty("�й�", "�л����񹲺͹�");
			FileOutputStream outStream = new FileOutputStream("bin/map/Config.properties");
			props.store(outStream,"д��ʱ���ע��-comments");

			props.load(Properties_Demo.class.getResourceAsStream("Config.properties"));
			System.out.println("�������еļ�ֵ��");
			//�۲�props�е�����
			for(Entry<Object,Object> entry:props.entrySet()) {
				System.out.println(entry.getKey()+" -- "+entry.getValue());
			}
	}

}
