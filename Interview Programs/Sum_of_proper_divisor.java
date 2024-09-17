import java.util.* ;
import java.io.*; 
public class Solution {
    static int sumOfProperDivisors(int n) {
        // Write your code here.
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

}


// Sample Input 1 :
// 2
// 6
// 1
// Sample Output 1 :
// 6
// 0
// Explanation For Sample Output 1 :
// For test case 1 :
// 1,2,3 are proper divisors of N=6. Therefore the sum is equal to 1+2+3 = 6

//LINK: https://www.naukri.com/code360/problems/divisor-sum_975476?interviewProblemRedirection=true&search=pr&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM