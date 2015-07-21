package topic;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 * 
 * @author yangtong
 *
 *accepted 2015.07.21
 */
public class LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s){
		String subStr = "";
		if(s==null||s==""){
			return 0;
		}
		int maxLength = 0;
		int tmpLength = 0;
		String point = null;
		int size = s.length();
		for(int i=0;i<size;i++){
			point = s.substring(i, i+1);
			if(!subStr.contains(point)){
				subStr+=point;
				tmpLength++;
				if(tmpLength>maxLength){
					maxLength = tmpLength;
				}
			}else {
				int repeatIndex = subStr.indexOf(point);
				subStr = subStr.substring(repeatIndex+1, subStr.length())+point;				
				tmpLength = subStr.length();
			}
		}
		return maxLength;
	}

	/**
	 * 怎么做啊？有点乱啊
	 * 这种方法是错的！！想复杂了，根本不需要这么复杂！！！
	 * @param s
	 * @return
	 */
//	public static int lengthOfLongestSubstring(String s) {
//		int result = 1;
//		String[] allChars = {"a","b","c","d","e","f","g",
//				"h","i","j","k","l","m","n",
//				"o","p","q","r","s","t",
//				"u","v","w","x","y","z"};
//		List<String[]> subStringsList = new ArrayList<String[]>();
//		for(int i=1;i<allChars.length;i++){
//			String[] tmpSubStrs = s.split(allChars[i]);
//			if(tmpSubStrs.length>3){
//				
//			}
//		}
//		String[] subStrings = s.split("a");
//		System.out.println("subStings length>>"+subStrings.length);
//		return result;
//	}
	
	
}
