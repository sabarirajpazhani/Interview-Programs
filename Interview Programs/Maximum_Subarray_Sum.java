import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long max=0;
		long sum=0;
		for(int i=0;i<n;i++){
				sum+=arr[i];
				if(max<sum){
					max=sum;
				}
				if(sum<0){
					sum=0;
				}
				if(max<0){
					max=0;
				}
		}
		return max;
		
	}
	
}


// Sample Input 1 :
// 9
// 1 2 7 -4 3 2 -10 9 1


// Sample Output 1 :
// 11


// Explanation for Sample 1 :
// The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].


//LINK:  https://www.naukri.com/code360/problems/maximum-subarray-sum_630526?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Dynamic%20Programming&leftPanelTabValue=PROBLEM