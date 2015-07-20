package topic;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 * @author yangtong
 *
 *accepted 2015.07.18
 *JAVAû���޷������ͣ�JAVA�ύʱ��һ��testcase��ʾԽ�硣����ύʹ�õ���C�Ĵ���
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
