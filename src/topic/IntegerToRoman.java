package topic;
/**
 * https://leetcode.com/problems/integer-to-roman/
 * 
 * 
 * @author yangtong
 *
 *accepted:2015.07.31
 */
public class IntegerToRoman {
	public String intToRoman(int num){
		if(num>3999||num<=0){
			return null;
		}
		String result = "";
		int tmp = num;
		int last = 0;
		int tmpCount = 1;
		while (tmp>0) {
			last = tmp%10;
			switch (tmpCount) {
			case 1:
				if (last<=3) {
					result = addNStr(last, "I")+result;
				}else if (last==4) {
					result = "IV"+result;
				}else if (last<=8) {
					result = "V"+addNStr((last-5), "I"+result);
				}else if (last==9) {
					result = "IX"+result;
				}
				break;
			case 10:
				if (last<=3) {
					result = addNStr(last, "X")+result;
				}else if (last==4) {
					result = "XL"+result;
				}else if (last<=8) {
					result = "L"+addNStr((last-5), "X")+result;
				}else if (last==9) {
					result = "XC"+result;
				}
				break;
			case 100:
				if (last<=3) {
					result = addNStr(last, "C")+result;
				}else if (last==4) {
					result = "CD"+result;
				}else if (last<=8) {
					result = "D"+addNStr((last-5), "C")+result;
				}else if (last==9) {
					result = "CM"+result;
				}
				break;
			case 1000:
				if(last<=3){
					result = addNStr(last, "M")+result;
				}
				break;

			default:
				break;
			}
			
			tmp = tmp/10;
			tmpCount = tmpCount*10;
		}
		
		return result;
	}
	
	private String addNStr(int n,String s){
		String result = "";
		for(int i=0;i<n;i++){
			result+=s;
		}
		return result;
	}
}
