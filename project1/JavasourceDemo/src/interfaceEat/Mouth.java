package interfaceEat;

public class Mouth implements Edible, Edible2 {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ��Overʱ��superǰ��д�ӿڵ�����
	 */
	@Override
	public void eating() {
		Edible.super.eating();
	}
	

}
