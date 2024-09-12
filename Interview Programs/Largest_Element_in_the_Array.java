import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int x=0;
        for(int i:arr){
            if(x<i){
                x=i;
            }
        }
        return x;

    }
}

// Sample input 1:
// 6
// 4 7 8 6 7 6 
// Sample output 1:
// 8
// Explanation of sample input 1:
// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.


//LINK: https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM