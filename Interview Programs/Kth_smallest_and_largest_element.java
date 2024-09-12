import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> a= new ArrayList<>();
		Collections.sort(arr);
		a.add(arr.get(k-1));
		a.add(arr.get(arr.size()-k));
		return a;
	}
}



// Sample Input 1:
// 2
// 4 4
// 5 6 7 2
// 4 3
// 1 2 5 4
// Sample Output 1:
// 7 2 
// 4 2
// Explanation of Sample Input 1:
// Test case 1:
// Here, ‘N’ = 4, ‘Arr’ = [5, 6, 7, 2] and ‘K’ = 3.
// Elements of the array in ascending order are [2, 5, 6, 7]
// Thus the 4rd smallest and 4rd largest elements of this array are 7 and 2 respectively.


//LINK : https://www.naukri.com/code360/problems/kth-smallest-and-largest-element-of-array_1115488?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM