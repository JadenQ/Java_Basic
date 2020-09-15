package fileDemos;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;

/**
 * 演示file类的常用方法
 * @todo TODO
 * @author Jaden
 * @date 2020年1月14日,上午10:31:13
 * @copyright Jaden
 */
public class FileDemo1 {
	
	
	public static void main(String[] args) {
		//变量用来存储路径，操作文件路径常量
		//private static final String FilePath = "src/fileDemos";
		//private static final String FilePath = "src/fileDemos/test.java";
		//一个用来选文件的包
		JFileChooser fileChooser = new JFileChooser(new File("."));
		//既可以选择文件，也可以选择文件夹
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
		//显示一个对话框：
		fileChooser.showOpenDialog(null);
		//获得用户选择的文件
		//判断获得文件的部分是否为null，如果为Null，说明点了取消
		File file = fileChooser.getSelectedFile();
		if(null == file) {
			System.out.println("用户没有x选择文件，退出！");
			System.exit(0);
		}
		System.out.println("文件/文件夹是否存在"+file.exists());
		System.out.println("是否为一个文件："+file.isFile());
		System.out.println("是否为一个文件夹："+file.isDirectory());
		System.out.println("文件名/目录名："+file.getName());
		System.out.println("绝对路径："+file.getAbsolutePath());
		System.out.println("相对路径："+file.getPath());
		System.out.println("最后修改时间："+new Date(file.lastModified()));
		System.out.println("是否隐藏："+file.isHidden());
		System.out.println("是否可读："+file.canRead());
		System.out.println("是否可写："+file.canWrite());
		System.out.println("所占空间"+file.length());
		//使用file类创建文件
		if(!file.exists()) {
			try {
				if(file.createNewFile()) {
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("文件/文件夹创建成功！");
		}
		
		//file类创建文件夹
		if(!file.exists()) {
				file.mkdir();
				//mkdirs()
				System.out.println("成功创建文件夹");
			}
			
			System.out.println("文件/文件夹创建成功！");
		
		//file类删除文件
		if(file.exists() && file.isFile()) {
			file.delete(); // 立即删除文件/目录
			//file.deleteOnExit(); // 在进程结束之后将文件删除
			System.out.println("删除成功！");
		}
		
		//列出当前目录下所有文件对象/文件名
		if(file.isDirectory()) {
			System.out.println(file.getAbsolutePath()+"路径下的所有文件和文件夹：");
			String[] fileNames = file.list(new DirFilter());
			for(int i = 0;i < fileNames.length; i++) {
				System.out.println(fileNames[i]);
			}
		}
		

		


	}
	//过滤器，过滤特定类型的文件
	//建立一个内部类
	/**
	 * 自定义一个文件名过滤器，必须实现filenameFilter中的接口
	 * @todo TODO
	 * @author Jaden
	 * @date 2020年1月15日,上午11:08:41
	 * @copyright Jaden
	 */
	static class DirFilter implements FilenameFilter{
		//最好使用正则表达式
		@Override
		public boolean accept(File dir, String name) {
			// 假设只显示java为后缀的文件，过滤掉其他。
			if(name.endsWith("java") || name.endsWith("project")) {
				return true;
			}
			return false;
		}
		
	}
	//FileFilter是类javax.swing的一个接口，另外一种过滤方法， 可以只看见需要的文件类型。
	static class MyFilefilter extends javax.swing.filechooser.FileFilter{

		@Override
		public boolean accept(File pathname) {
			if(pathname.getName().endsWith("java") || pathname.getName().endsWith("project")) {
				return true;
			}
			return false;
		}
		//自动写上重写
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "*.*,*.java";
		}

	}
		
}

