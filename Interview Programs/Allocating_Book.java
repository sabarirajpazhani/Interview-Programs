import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static boolean isPossible(int x,ArrayList<Integer> a,int k){
        int stu=1;
        int page=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>x){
                return false;
            }
            if(a.get(i)+page>x){
                stu+=1;
                page=a.get(i);
            }
            else{
                page+=a.get(i);
            }
        }
        return stu<=k;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n){
            return -1;
        }
        int max=Collections.max(arr);
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int low = max;
        int high = sum;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(mid,arr,m)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
}



// Example:
// Input: ‘n’ = 4 ‘m’ = 2 
// ‘arr’ = [12, 34, 67, 90]

// Output: 113

// Explanation: All possible ways to allocate the ‘4’ books to '2' students are:

// 12 | 34, 67, 90 - the sum of all the pages of books allocated to student 1 is ‘12’, and student two is ‘34+ 67+ 90 = 191’, so the maximum is ‘max(12, 191)= 191’.

// 12, 34 | 67, 90 - the sum of all the pages of books allocated to student 1 is ‘12+ 34 = 46’, and student two is ‘67+ 90 = 157’, so the maximum is ‘max(46, 157)= 157’.

// 12, 34, 67 | 90 - the sum of all the pages of books allocated to student 1 is ‘12+ 34 +67 = 113’, and student two is ‘90’, so the maximum is ‘max(113, 90)= 113’.

// We are getting the minimum in the last case.

// Hence answer is ‘113’.


//LINK:  https://www.naukri.com/code360/problems/allocate-books_1090540?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Dynamic%20Programming&difficulty%5B%5D=Medium&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM