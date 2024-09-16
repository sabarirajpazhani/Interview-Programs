import java.util.*;
public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        int x=-1;
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(e.getValue()==1){
                x=e.getKey();
            }
        }
        return x;
    }
}


// Sample Input 1:
// 5
// 1 1 2 2 3


// Sample Output 1:
// 3


// Explanation of sample output 1:
// {1, 2} each occurs twice, whereas 3 occurs only once.
// Hence the answer is 3.


//LINK: https://www.naukri.com/code360/problems/find-the-single-element_6680465?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM