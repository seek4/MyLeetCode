package topic;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/3sum/
 * 
 * @author yangtong
 *
 */
public class ThreeSum {
	/**
	 * 三层循环？
	 * 恩，本地测试无误，但是嘛，果然！超时了。。。
	 * @param nums
	 * @return
	 */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        int smaller = 0;
        int tmp = 0;           
    	for(int i=0;i<nums.length-2;i++){
    		for(int j=i+1;j<nums.length-1;j++){
    			for(int k=j+1;k<nums.length;k++){
    				if(nums[i]+nums[j]+nums[k]==0){
    					List<Integer> result = new ArrayList<>();
    					if(nums[i]<=nums[j]){
    						smaller = nums[i];
    						tmp = nums[j];
    					}else {
							smaller = nums[j];
							tmp = nums[i];
						}
    					if(nums[k]<=smaller){
    						result.add(nums[k]);
    						result.add(smaller);
    						result.add(tmp);
    					}else {
							result.add(smaller);
							if(tmp<=nums[k]){
								result.add(tmp);
								result.add(nums[k]);
							}else {
								result.add(nums[k]);
								result.add(tmp);
							}
						}
    					results.add(result);
    				}
    			}
    		}
    	}
    	for(int m=0;m<results.size();m++){
    		for(int n=m+1;n<results.size();n++){
    			if(results.get(m).get(0)==results.get(n).get(0)
    					&&results.get(m).get(1)==results.get(n).get(1)){
    				results.remove(n);
    				n--;
    			}
    		}
    	}
        return results;
    }
}
