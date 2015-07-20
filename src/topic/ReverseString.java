package topic;

/**
 * leetcode.com/problems/reverse-words-in-a-string/
 * accpected 2015.07.18
 * @author yangtong
 *
 */
public class ReverseString {

	public static String reverseWords(String s){
		String result = "";
		int length = s.length();
		int lastIndex = length;
		for(int i=length-1;i>=0;i--){
			if(s.charAt(i)==' '){
				if(lastIndex-i>1){
					result = result + s.substring(i+1, lastIndex)+" ";
				}
				lastIndex = i;
			} 	
		}
		if(lastIndex>0){
			result+=s.substring(0, lastIndex);
		}
		result = result.trim();
		return result;
	}
}
