package topic;

/**
 * https://leetcode.com/problems/reverse-integer/
 * easy
 * @author yangtong
 *accepted:2015.07.21
 */
public class ReverseInteger {
	/**
	 * ×¢ÒâÒç³ö
	 * @param x
	 * @return
	 */
	public int reverse(int x){
		int tmp = x;
		int MAX_INT = 2147483647;
		int MIN_INT = -2147483648;
		long tmp2 = 0;
		while (tmp!=0) {
			tmp2 = tmp2*10+tmp%10;
			tmp = tmp/10;
		}
		if(tmp2>MAX_INT)
			return 0;
		if(tmp2<MIN_INT)
			return 0;
		return (int) tmp2;
	}
}
