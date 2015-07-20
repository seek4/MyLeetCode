package topic;

/**
 * https://leetcode.com/problems/divide-two-integers/
 * 
 * @author yangtong
 *
 *accepted 2015.07.20
 */
public class DivideTwoIntegers {
	
	/**
	 * 二分法
	 * 我操，越界问题太蛋疼！
	 * @param dividend 被除数
	 * @param divisor 除数
	 * @return
	 */
	public static int divide(int dividend,int divisor){
		long result = 0;
		int MAX_INT = 2147483647;
		boolean isReverse = false;
		long mDividend = dividend;
		long mDivisor = divisor;
		if(dividend<0){
			isReverse = !isReverse;
			mDividend = -mDividend;
		}
		if(divisor<0){
			isReverse = !isReverse;
			mDivisor = -mDivisor;
		}
		if(mDividend==0)
			return 0;
		if(mDivisor==0)
			return MAX_INT;
		long tmp = mDivisor;
		long tmpResult = 1;
		long remainder = mDividend;
		while (remainder>=mDivisor) {
			tmp = mDivisor;
			tmpResult = 1;
			while ((tmp+tmp)<=remainder) {
				tmp = tmp+tmp;
				tmpResult = tmpResult+tmpResult;
			}
			remainder = remainder - tmp;
			result = result +tmpResult;
		}
		if(isReverse)
			result = -result;
		if(result>0&&(int)result<0){	//是否越界
			return MAX_INT;
		}
		return (int) result;
	}
	
	
	/**
	 * Time Limit Exceeded
	 */
//	public static int divide(int dividend,int divisor){		
//		int MAX_INT = 2147483647;
//		boolean isReverse = false;
//		int mDividend = dividend;
//		int mDivisor = divisor;
//		if(dividend<0){
//			isReverse = !isReverse;
//			mDividend = -dividend;
//		}
//		if(divisor<0){
//			isReverse = !isReverse;
//			mDivisor = -divisor;
//		}
//		if(mDividend==0)
//			return 0;
//		if(mDivisor==0)
//			return MAX_INT;
//		int result = 1;
//		int tmp = mDivisor;
//		while (!(mDividend<=tmp)) {
//			result++;
//			tmp+=mDivisor;
//		}
//		if(tmp>mDividend)
//			result--;
//		if(isReverse)
//			result = -result;
//		return result;
//	}
	
}
