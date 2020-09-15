package fileDemos;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;

/**
 * ��ʾfile��ĳ��÷���
 * @todo TODO
 * @author Jaden
 * @date 2020��1��14��,����10:31:13
 * @copyright Jaden
 */
public class FileDemo1 {
	
	
	public static void main(String[] args) {
		//���������洢·���������ļ�·������
		//private static final String FilePath = "src/fileDemos";
		//private static final String FilePath = "src/fileDemos/test.java";
		//һ������ѡ�ļ��İ�
		JFileChooser fileChooser = new JFileChooser(new File("."));
		//�ȿ���ѡ���ļ���Ҳ����ѡ���ļ���
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
		//��ʾһ���Ի���
		fileChooser.showOpenDialog(null);
		//����û�ѡ����ļ�
		//�жϻ���ļ��Ĳ����Ƿ�Ϊnull�����ΪNull��˵������ȡ��
		File file = fileChooser.getSelectedFile();
		if(null == file) {
			System.out.println("�û�û��xѡ���ļ����˳���");
			System.exit(0);
		}
		System.out.println("�ļ�/�ļ����Ƿ����"+file.exists());
		System.out.println("�Ƿ�Ϊһ���ļ���"+file.isFile());
		System.out.println("�Ƿ�Ϊһ���ļ��У�"+file.isDirectory());
		System.out.println("�ļ���/Ŀ¼����"+file.getName());
		System.out.println("����·����"+file.getAbsolutePath());
		System.out.println("���·����"+file.getPath());
		System.out.println("����޸�ʱ�䣺"+new Date(file.lastModified()));
		System.out.println("�Ƿ����أ�"+file.isHidden());
		System.out.println("�Ƿ�ɶ���"+file.canRead());
		System.out.println("�Ƿ��д��"+file.canWrite());
		System.out.println("��ռ�ռ�"+file.length());
		//ʹ��file�ഴ���ļ�
		if(!file.exists()) {
			try {
				if(file.createNewFile()) {
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("�ļ�/�ļ��д����ɹ���");
		}
		
		//file�ഴ���ļ���
		if(!file.exists()) {
				file.mkdir();
				//mkdirs()
				System.out.println("�ɹ������ļ���");
			}
			
			System.out.println("�ļ�/�ļ��д����ɹ���");
		
		//file��ɾ���ļ�
		if(file.exists() && file.isFile()) {
			file.delete(); // ����ɾ���ļ�/Ŀ¼
			//file.deleteOnExit(); // �ڽ��̽���֮���ļ�ɾ��
			System.out.println("ɾ���ɹ���");
		}
		
		//�г���ǰĿ¼�������ļ�����/�ļ���
		if(file.isDirectory()) {
			System.out.println(file.getAbsolutePath()+"·���µ������ļ����ļ��У�");
			String[] fileNames = file.list(new DirFilter());
			for(int i = 0;i < fileNames.length; i++) {
				System.out.println(fileNames[i]);
			}
		}
		

		


	}
	//�������������ض����͵��ļ�
	//����һ���ڲ���
	/**
	 * �Զ���һ���ļ���������������ʵ��filenameFilter�еĽӿ�
	 * @todo TODO
	 * @author Jaden
	 * @date 2020��1��15��,����11:08:41
	 * @copyright Jaden
	 */
	static class DirFilter implements FilenameFilter{
		//���ʹ��������ʽ
		@Override
		public boolean accept(File dir, String name) {
			// ����ֻ��ʾjavaΪ��׺���ļ������˵�������
			if(name.endsWith("java") || name.endsWith("project")) {
				return true;
			}
			return false;
		}
		
	}
	//FileFilter����javax.swing��һ���ӿڣ�����һ�ֹ��˷����� ����ֻ������Ҫ���ļ����͡�
	static class MyFilefilter extends javax.swing.filechooser.FileFilter{

		@Override
		public boolean accept(File pathname) {
			if(pathname.getName().endsWith("java") || pathname.getName().endsWith("project")) {
				return true;
			}
			return false;
		}
		//�Զ�д����д
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "*.*,*.java";
		}

	}
		
}

