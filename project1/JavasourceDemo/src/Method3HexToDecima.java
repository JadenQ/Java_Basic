import java.util.Scanner;
public class Method3HexToDecima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//1.input a decimal
		System.out.print("��������");
		int decNum = input.nextInt();
		//2.trans dec to hex
		System.out.println(hexToDec(decNum));
		//3.hex to dec
		System.out.println(DecToHex(hexToDec(decNum)));
	}
	
	
	//16����ʹ���ַ���
	/**
	 *����ת��ʮ����Ϊ16����:ѭ����������ֱ��decNum����Ϊ0Ϊֹ
	 * @param decNum ʮ��������
	 * @return ʮ����������
	 */
	public static String hexToDec(int decNum) {
		// num/16 ȡ����
		String hex = "";
		while(decNum != 0) {
			int temp = decNum % 16; //����
			//0-9֮������֣�����10-15
			if(temp >= 0 && temp <= 9) {
				hex = temp + hex; //ÿȡһ����������ǰƴ��
			}
			else if(temp >= 10 && temp <= 15) {
				hex = (char)(temp - 10 + 'A') + hex;
			}
			decNum /= 16;
		}
		return hex;
	}
	
	/**
	 * decimal to hex�� ÿһλ�����ӷ�
	 * @param hex 
	 * @return ʮ��������
	 */
	public static int DecToHex(String hex) {
		int decNum = 0;
		//���ַ�������һ���ַ����飺ȡ���ַ����е�ÿһ���ַ������жϻ�ת��
		for(int i = 0; i < hex.length(); i++) {
			char tempChar = hex.charAt(i); //ȡ��char�е��ض�λ��
			// 0 -9 A - F
			if(tempChar >= '0' && tempChar <= '9') {
				//��β����i����Ӧλ���� len - i - 1
				decNum += (tempChar - '0') * Math.pow(16, hex.length()-i-1);
			}
			else if(tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1 );				
			}
		}				
		return decNum;
	}
	

}
