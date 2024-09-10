import java.util.*;
import java.util.ArrayList;
import java.util.Map;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		int x=0;
		Map<Integer,Integer> m =new HashMap<>();
		for(int i:arr){
			m.put(i,m.getOrDefault(i,0)+1);
		}
		for(Map.Entry<Integer,Integer>e:m.entrySet()){
			if(e.getValue()>1){
				x=e.getKey();
			}
		}
		return x;
	}
}


// Sample Input 1:
// 2
// 5
// 4 2 1 3 1
// 7
// 6 3 1 5 4 3 2
// Sample Output 1:
// 1
// 3
// Explanation of sample input 1:
// For the first test case, 
// The duplicate integer value present in the array is 1. Hence, the answer is 1 in this case.

// For the second test case,
// The duplicate integer value present in the array is 3. Hence, the answer is 3 in this case.


//LINK: https://www.naukri.com/code360/problems/duplicate-in-array_893397?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Dynamic%20Programming&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM