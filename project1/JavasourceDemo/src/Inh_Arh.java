
public class Inh_Arh extends Inh_Hero{
	private int magicAttack;
	/**
	 * սʿ�ľ�̬���ԣ�ÿʵ����һ���µ�սʿ����ID++
	 */
	public static int ID = 0;
	
	//Ĭ��һ����ɫ����
	public Inh_Arh() {
		setNickName("default firer"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurLife(100);
		setMagicAttack(8);
		ID++;
	}
	
	//����������
	public Inh_Arh(String nickName) {
		this(); //���ø����Լ���Ĭ�Ϲ���
		setNickName(nickName);
	}
	
	public void fire() {
		System.out.println("��ʦ"+getNickName()+" burning thee!");
	}

	//��дһ��toStringȥ��ӡ��ɫ��Ϣ alt+/,���Բ���д.toString��ֱ�ӵ���
	@Override

	public String toString() {
		
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t\t");
		str.append(getCurLife());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t");
		str.append(getMagicAttack());
		
		return str.toString();
	}

	
	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
}
