import java.util.*;
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            a.add(e.getKey());
        }
        return a.size();
        
    }
}



// For example:
// 'n' = 5, 'arr' = [1 2 2 2 3].
// The new array will be [1 2 3].
// So our answer is 3.


//LINK: https://www.naukri.com/code360/problems/remove-duplicates-from-sorted-array_1102307?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM