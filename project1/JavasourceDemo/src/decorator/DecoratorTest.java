package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/**
 * ʹ�ó��ϣ�1.��Ҫ�ڲ�Ӱ���������������£��Զ�̬͸���ķ�ʽΪ������ӹ���
 * 2.���ʺ�ʹ�ü̳У���������з�������չʱ
 * @todo TODO
 * @author Jaden
 * @date 2020��2��7��,����9:29:26
 * @copyright Jaden
 */
public class DecoratorTest {

	public static void main(String[] args) throws FileNotFoundException {
		// ����Ҫ��װ�ε�ԭʼ����
		Component component = new TrueComponent();
		//Ϊԭʼ����͸�������ӹ���
		//Decorator decoratorA = new ComponentImp(component);
		ComponentImp componentA = new ComponentImp(component);
		componentA.read();
		ComponentImp2 componentB = new ComponentImp2(component);
		componentB.read();
		
		InputStream inputstream = new FileInputStream("");
		//ʹ�ô������������װ������������: ��һ���Ѿ�д���˵�װ������ֻ�˽�ʹ�þͿ�����
		BufferedInputStream bInStream = new BufferedInputStream(inputstream);
		
	}

}
