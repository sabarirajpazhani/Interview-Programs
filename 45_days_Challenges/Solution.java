import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findRowK(int[][] mat) {
        // Write your code here.
        int n=mat.length;
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(i!=j && (mat[i][j]!=0 || mat[j][i]!=1)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;

    }
}

// Sample Input 1 :
// 1
// 3
// 0 1 1 
// 0 1 0 
// 1 1 0 
// Sample Output 1 :
// 1
// Explanation For Sample Output 1:
// For the first test case, column 1 contains all ones. Also except mat[1][1] all numbers in row 1 are 0.
// Sample Input 2:
// 2
// 2
// 0 1
// 1 0
// 2
// 0 0
// 1 0
// Sample Output 2:
// -1
// 0

//LINK: https://www.naukri.com/code360/problems/find-row-k_920510?topList=45-day-coding-challenge&problemListRedirection=true&leftPanelTabValue=PROBLEM