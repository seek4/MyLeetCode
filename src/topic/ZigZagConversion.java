package topic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author yangtong
 *
 */
public class ZigZagConversion {
	
	
	/**
	 * abcdefghijklmnopq
	 * 
	 * a     g     m
	 * b   f h   l n
	 * c e   i k   o q
	 * d     j     p
	 * 
	 * 
	 */
	
	
	/**
	 * Time Limit Exceeded
	 * 不知为何报超时的错，郁闷。java效率太低？
	 * 再次运行，居然accepted了。。。
	 * @param s
	 * @param numRows
	 * @return
	 */
	public String convert(String s,int numRows){
		String result = "";
		List<String> lines = new ArrayList<String>();
		for(int i=0;i<numRows;i++){
			lines.add("");
		}
	
		int size = s.length();
		int linePoint = 0;
		boolean addMode = true;
		for(int j=0;j<size;j++){
			lines.set(linePoint,lines.get(linePoint)+s.charAt(j));
			if (addMode) {
				linePoint++;
				if(linePoint>numRows-1&&numRows>1){
					linePoint = numRows-2;
					addMode = false;
				}else if (linePoint>numRows-1) {
					linePoint = 0;
					addMode = false;
				}
			}else {
				linePoint--;
				if(linePoint<0&&numRows>1){
					linePoint = 1;
					addMode = true;
				}else if (linePoint<0) {
					linePoint = 0;
					addMode = true;
				}
			}
		}
		int lineSize = lines.size();
		for(int k=0;k<lineSize;k++){
			result = result +lines.get(k);
		}
		return result;
	}
}
