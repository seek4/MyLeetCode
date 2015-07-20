package topic;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * accepted:2015.07.18
 * @author yangtong
 *
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target){	
		int size = nums.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(nums[i]+nums[j]==target){
					int[] result = {i+1,j+1};
					return result;
				}
			}
		}
		int[] notFound = {0,0};//0,0|||
		return notFound;
	}
}
