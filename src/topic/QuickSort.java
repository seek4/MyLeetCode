package topic;
/**
 * 
 * 无聊，写写快排
 * @author yangtong
 *
 */
public class QuickSort {
	public void sort(int arr[],int low,int high){
		int key = arr[low];
		if(low == high){
			return;
		}
		boolean fromBack = true;
		int headPoint = low;
		int tailPoint = high;
		while (headPoint<tailPoint) {
			if(fromBack){
				if(arr[tailPoint]<key){
					swapData(arr, tailPoint, headPoint);
					fromBack = false;
					headPoint++;
				}else {
					tailPoint--;
				}
			}else {
				if(arr[headPoint]>key){
					swapData(arr, tailPoint, headPoint);
					tailPoint--;
					fromBack = true;
				}else {
					headPoint++;
				}
			}
		}
		if(headPoint>low){
			sort(arr, low, headPoint-1);
		}
		if(headPoint<high){
			sort(arr, headPoint+1, high);
		}
	}
	
	public static void swapData(int[] arr,int index1,int index2){
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
}
