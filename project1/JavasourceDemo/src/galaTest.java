
public class galaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		galaDerictor ����ı = new galaDerictor();
		galaSinger ����Ӣ = new galaSinger("����Ӣ");
		galaDancer ����Ƽ = new galaDancer("����Ƽ");
		//ʵ�������������ʱ�򲢲����� ������ӡ�abstract�����󻯸��ࣨ���
		//galaActor Secretactor = new galaActor("������");
		
		����ı.action(����Ӣ);
		����ı.action(����Ƽ);
		//����ı.action(Secretactor);
		
		
		//���������������Ա������ҵ����빦�ܲ���
	}

}
