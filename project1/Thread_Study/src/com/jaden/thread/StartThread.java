package com.jaden.thread;

/**
 * �����̷߳�ʽ1��
 * 1.�̳�thread����дrun
 * 2.�����������
 * @todo TODO
 * @author Jaden
 * @date 2020��3��22��,����9:46:18
 * @copyright Jaden
 */
public class StartThread extends Thread{

	@Override
	public void run() {
		//�����ˣ��߳������ڵ�+�߳�ִ�еĴ���
		for(int i = 0; i < 20; i++) {
			System.out.println("һ������");
		}
	}
	
	public static void main(String[] args) {
		//�����������
		StartThread st = new StartThread();
		//����
		st.start(); //main������start���߳�ͬʱ������ JNI������
		//��cpuȥ���ȷ��䣬����֤��������
		//st.run(); //run������������ִ�и��߳�
		for(int i = 0; i < 20; i++) {
			System.out.println("һ��coding");
		}
		
	}

}