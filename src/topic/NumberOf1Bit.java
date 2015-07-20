package topic;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 * @author yangtong
 *
 *accepted 2015.07.18
 *JAVA没有无符号类型，JAVA提交时有一个testcase显示越界。因此提交使用的是C的代码
 */
public class NumberOf1Bit {
	public static int hammingWeight(int n){
		int count = 0;
		int m = n;
		while (m>0) {
			if(m%2==1){
				count++;
			}
			m = m/2;
		}
		return count;
	}
	
}
