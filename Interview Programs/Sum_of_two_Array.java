import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		// Write your code here.
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for(int i:a){
			sb1.append(i);
		}

		for(int i:b){
			sb2.append(i);
		}

		int n1 = Integer.parseInt(sb1.toString());
		int n2 = Integer.parseInt(sb2.toString());

		int sum = n1+n2;

		String s = Integer.toString(sum);

		int arr[] = new int[s.length()];

		for(int i=0;i<s.length();i++){
			arr[i]=s.charAt(i) - '0';
		}

		return arr;
	}
}


// Sample Input 1:
// 2
// 4 1 
// 1 2 3 4
// 6
// 3 2
// 1 2 3
// 9 9    
// Sample Output 1:
// 1 2 4 0
// 2 2 2
// Explanation For Sample Input 1:
// For the first test case, the integer represented by the first array is 1234 and the second array is 6, so the sum is 1234 + 6 =  1240.

// For the second test case, the integer represented by the first array is 123 and the second array is 99, so the sum is 123 + 99 = 222.


//LINK: https://www.naukri.com/code360/problems/sum-of-two-arrays_893186?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM