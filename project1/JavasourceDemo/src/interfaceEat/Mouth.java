package interfaceEat;

public class Mouth implements Edible, Edible2 {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 再Over时候，super前面写接口的名字
	 */
	@Override
	public void eating() {
		Edible.super.eating();
	}
	

}
