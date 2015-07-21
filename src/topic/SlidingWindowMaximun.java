package topic;

/**
 * https://leetcode.com/problems/sliding-window-maximum/
 * @author yangtong
 * accepted:2015.07.21
 */
public class SlidingWindowMaximun {
	public int[] maxSlidingWindow(int[] nums,int k){
		if(k>nums.length||k==0){
			int[] nullResult= new int[0];
			return nullResult;
		}
		int[] maxs = new int[nums.length-k+1];
		int maxIndex = 0;
		int count = k;
		int tmpMax;
		tmpMax = -2147483648;	//min interger
		for(int i=0;i<k;i++){
			if(nums[i]>tmpMax){
				tmpMax = nums[i];
				count = k;
			}else {
				count--;
			}
		}
		count--;
		maxs[maxIndex++] = tmpMax;
		for(int j=k;j<nums.length;j++){
			if(nums[j]>=tmpMax){
				tmpMax = nums[j];
				count = k;
			}else if (count<=0) {
				tmpMax = nums[j];
				for(int m=j-k+1;m<=j;m++){
					System.out.println("m >>"+m);
					if(nums[m]>tmpMax){
						tmpMax = nums[m];
						count = k;
					}else {
						count--;
					}
				}
			}
			maxs[maxIndex++] = tmpMax;
			count--;
		}
		return maxs;
	}
}
