/**
 * 
 * @todo 累加和
 * @author Jaden
 * @date 2019年11月22日,上午10:01:56
 * @copyright Jaden
 */
public class Sum {

	public static void main(String[] args) {
		// TODO 求和
		int sum = 0; // save the sum
		int i = 0;
		while(i < 100) {
			sum = sum + (i + 1);
			// sum += (i+1)
			i++;
			
			//等价： sum += i++;
		}
		System.out.println(sum);
	}

}
