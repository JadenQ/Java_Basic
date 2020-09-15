import java.util.Scanner;
public class Method3HexToDecima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//1.input a decimal
		System.out.print("整型数：");
		int decNum = input.nextInt();
		//2.trans dec to hex
		System.out.println(hexToDec(decNum));
		//3.hex to dec
		System.out.println(DecToHex(hexToDec(decNum)));
	}
	
	
	//16进制使用字符串
	/**
	 *用来转换十进制为16进制:循环求余数，直到decNum被化为0为止
	 * @param decNum 十进制数字
	 * @return 十六进制数字
	 */
	public static String hexToDec(int decNum) {
		// num/16 取余数
		String hex = "";
		while(decNum != 0) {
			int temp = decNum % 16; //余数
			//0-9之间的数字，或者10-15
			if(temp >= 0 && temp <= 9) {
				hex = temp + hex; //每取一个余数就往前拼接
			}
			else if(temp >= 10 && temp <= 15) {
				hex = (char)(temp - 10 + 'A') + hex;
			}
			decNum /= 16;
		}
		return hex;
	}
	
	/**
	 * decimal to hex： 每一位轮流加方
	 * @param hex 
	 * @return 十进制数字
	 */
	public static int DecToHex(String hex) {
		int decNum = 0;
		//将字符串当作一个字符数组：取出字符串中的每一个字符进行判断或转换
		for(int i = 0; i < hex.length(); i++) {
			char tempChar = hex.charAt(i); //取出char中的特定位置
			// 0 -9 A - F
			if(tempChar >= '0' && tempChar <= '9') {
				//从尾部找i，对应位置是 len - i - 1
				decNum += (tempChar - '0') * Math.pow(16, hex.length()-i-1);
			}
			else if(tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1 );				
			}
		}				
		return decNum;
	}
	

}
