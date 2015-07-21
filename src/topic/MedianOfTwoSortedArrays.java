package topic;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * There are two sorted arrays nums1 and nums2 of size m and n 
 * respectively. Find the median of the two sorted arrays. The
 *  overall run time complexity should be O(log (m+n)).
 * 
 * @author yangtong
 * 
 * accepted:2015.07.21
 *
 */
public class MedianOfTwoSortedArrays {
	/**
	 * 归并排序类似
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1,int[] nums2){
		double median = 0;
		boolean isOdd = false;
		int midPoint = 1;
		System.out.println("length >>"+(nums1.length+nums2.length)%2);		
		if((nums1.length+nums2.length)%2==1){
			isOdd = true;
			midPoint = (nums1.length+nums2.length)/2;
		}else {
			isOdd = false;
			midPoint = (nums1.length+nums2.length)/2-1;
		}
		int tmp = 0;
		boolean num1Finish = false;
		boolean num2Finish = false;
		if(nums1.length==0)
			num1Finish = true;
		if(nums2.length==0)
			num2Finish = true;
		for(int i=0,j=0,k=0;i<(nums1.length+nums2.length);i++){
			if((j<nums1.length)&&(num2Finish||nums1[j]<=nums2[k])){	
				tmp = nums1[j];
				if(j<nums1.length-1){
					j++;
				}else {
					j=nums1.length;
					num1Finish = true;
				}
			}else if ((k<nums2.length)&&(num1Finish||nums1[j]>nums2[k])) {
				tmp = nums2[k];
				if(k<nums2.length-1){
					k++;
				}else {
					k=nums2.length;
					num2Finish = true;
				}
			}
			if(i==midPoint){
				if(isOdd){					
					median =  tmp;
					break;
				}else {
					if((j<nums1.length)&&(num2Finish||nums1[j]<=nums2[k])){
						median =  ((float)tmp+(float)nums1[j])/2;
						break;
					}else if ((k<nums2.length)&&(num1Finish||nums1[j]>nums2[k])) {
						median =  ((float)tmp+(float)nums2[k])/2;
						break;
					}
				}
			}
		}
		return median;
	}
}
