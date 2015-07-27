package topic;
/**
 * https://leetcode.com/problems/power-of-two/
 * 
 * û�����飬ˢ��ˮ��ѹѹ��
 * @author yangtong
 *accepted:2015.07.23
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n){
		if(n<=0)
			return false;
		int tmp = n;
		while(tmp%2!=1){
			tmp = tmp/2;
		}
		if(tmp==1)
			return true;
		return false;
	}
}
