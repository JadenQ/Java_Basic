package map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class Properties_Demo {

	public static void main(String[] args) throws IOException {
		//读取properties文件的常用方法//因为文件在不同设备中路径不同
		Properties props = new Properties();
		//加载配置文件 - 固定写法
		//载入一个流
			props.load(Properties_Demo.class.getResourceAsStream("Config.properties"));
			//类似于键值集合
			
		//读取配置
			//返回user的值，如果没有值则返回abc
			String value = props.getProperty("user","abc");
			System.out.println(value);
		//向配置文件中写入内容:应当输出到bin目录
			props.setProperty("name", "Monkey");
			props.setProperty("中国", "中华人民共和国");
			FileOutputStream outStream = new FileOutputStream("bin/map/Config.properties");
			props.store(outStream,"写入时候的注释-comments");

			props.load(Properties_Demo.class.getResourceAsStream("Config.properties"));
			System.out.println("遍历所有的键值对");
			//观察props中的类型
			for(Entry<Object,Object> entry:props.entrySet()) {
				System.out.println(entry.getKey()+" -- "+entry.getValue());
			}
	}

}
