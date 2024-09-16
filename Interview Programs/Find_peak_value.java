import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int x=0;
        int index=0;
        for(int i=0;i<arr.size();i++){
            if(x<arr.get(i)){
                x=arr.get(i);
                index=i;
            }
        }
        return index;
    }
};



// Sample Input 1:
// 5
// 1 8 1 5 3


// Expected Answer:
// 1


// Output on Console:
// True


// Explanation of sample input 1 :
// There are two possible answers. Both 8 and 5 are peak elements, so the correct answers are their positions, 1 and 3. Any of these 2 numbers will print 'True'.


// Sample Input 2:
// 3
// 1 2 1 


// Expected Answer:
// 1


// Output on Console:
// True


// Expected time complexity:
// The expected time complexity is O(log 'n').

// LINK : https://www.naukri.com/code360/problems/find-peak-element_1081482?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM