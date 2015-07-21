package topic;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 * @author yangtong
 *
 *accepted 2015.07.21
 */
public class StringToIntergerAtoi {
	/**
	 * 需要考虑的情况好多啊。。。。尤其是溢出的问题
	 * @param str
	 * @return
	 */
	public int myAtoi(String str){	
		long result = 0;
		int num = 0;
		str = str.trim();
		int size = str.length();
		boolean isNegative = false;
		boolean isPositive = false;
		boolean isPoint = false;
		boolean isBroken = false;
		int MAX_INT = 2147483647;
		int MIN_INT = -2147483648;
		for(int i=0;i<size;i++){
			switch (str.charAt(i)) {
			case '1':
				num = 1;
				break;
			case '2':
				num = 2;
				break;
			case '3':
				num = 3;
				break;
			case '4':
				num = 4;
				break;
			case '5':
				num = 5;
				break;
			case '6':
				num = 6;
				break;
			case '7':
				num = 7;
				break;
			case '8':
				num = 8;
				break;
			case '9':
				num = 9;
				break;
			case '0':
				num = 0;
				break;
			case '-':
				if (result!=0||isPositive||isNegative) {
					return 0;
				}
				isNegative = true;
				break;
			case '.':
				isPoint = true;
				break;
			case '+':
				if (result!=0||isNegative||isPositive) {
					return 0;
				}
				isPositive = true;
				break;
			default:
				isBroken = true;
				break;
			}
			if(isPoint||isBroken){
				break;
			}
			result = result*10+num;
			if(result>MAX_INT){
				break;
			}
		}
		if(isNegative)
			result = -result;
		if(result>MAX_INT)
			return MAX_INT;
		if(result<MIN_INT)
			return MIN_INT;
		return (int) result;
	}
}
