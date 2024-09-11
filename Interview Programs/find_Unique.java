import java.util.Map;
import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
      int x=-1;
      Map<Integer,Integer> m = new HashMap<>();
      for(int i:arr){
        m.put(i,m.getOrDefault(i,0)+1);
      }
      for(Map.Entry<Integer,Integer> e : m.entrySet()){
        if(e.getValue()==1){
          x=e.getKey();
        }
      }
      return x;
		//Your code goes here
    }
}


// Sample Input 1:
// 1
// 7
// 2 3 1 6 3 6 2
// Sample Output 1:
// 1
// Explanation: The array is [2, 3, 1, 6, 3, 6, 2]. Here, the numbers 2, 3, and 6 are present twice, and the number 1 is present only once. So, the unique number in this array is 1.

//LINK: https://www.naukri.com/code360/problems/find-unique_625159?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Dynamic%20Programming&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM