/**
 * 
 * @todo �ۼӺ�
 * @author Jaden
 * @date 2019��11��22��,����10:01:56
 * @copyright Jaden
 */
public class Sum {

	public static void main(String[] args) {
		// TODO ���
		int sum = 0; // save the sum
		int i = 0;
		while(i < 100) {
			sum = sum + (i + 1);
			// sum += (i+1)
			i++;
			
			//�ȼۣ� sum += i++;
		}
		System.out.println(sum);
	}

}
