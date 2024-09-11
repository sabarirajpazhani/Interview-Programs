public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int x=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x=i;
            }
        }
        return x;
    }
}



// Sample Input 1:
// 7
// 1 3 7 9 11 12 45
// 3
// Sample Output 1:
// 1
// Explanation of sample output 1:
// nums = [1, 3, 7, 9, 11, 12, 45],
// The index of element '3' is 1.
// Hence, the answer is '1'.


//LINK :https://www.naukri.com/code360/problems/binary-search_972?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Dynamic%20Programming&difficulty%5B%5D=Easy 