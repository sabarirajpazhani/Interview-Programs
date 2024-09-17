import java.util.* ;
import java.io.*; 
public class Solution
{
    public static String strThree0Three1(int m, int n) 
    {
   		// Write your code here
        StringBuilder sb = new StringBuilder();

        while(m>0 || n>0){
            if(m>n){
                if(m>1){
                    sb.append("00");
                    m-=2;
                }
                else{
                    sb.append("0");
                    m--;
                }
                if(n>0){
                    sb.append("1");
                    n--;
                }
            }
            else if(n>m){
                if(n>1){
                    sb.append("11");
                    n-=2;
                }
                else{
                    sb.append("1");
                    n--;
                }
                if(m>0){
                    sb.append("0");
                    m--;
                }
            }
            else{
                if(m>0){
                    sb.append("0");
                    m--;
                }
                if(n>0){
                    sb.append("1");
                    n--;
                }
            }
        }
        return sb.toString();
        
    }
}



// Problem statement
// You have to create any binary string ‘S’ of length ‘M+N’ which has exactly ‘M’ 0’s and ‘N’ 1’s. S can not have ‘111’ or ‘000’ as a substring.

// Given ‘M’ and ‘N’ it is guaranteed that there exists at least one binary string ‘S’.

// The substring of a string is obtained by deleting characters from the start and end of the string.

// For example:
// M = 6, N = 6
// ANS = “110011001100”

// In ans no three consecutive characters are same. 
// ANS=”001100110011” is also a valid answer.

//Sample Input 1:
// 2
// 4 1
// 4 2
// Sample Output 1:
// 00100
// 001100
// Explanation For Sample Input 1:
// For the first test case, there is only one correct binary string ‘00100’ 

// For the second test case “001100”, “010100”, “100100‘ etc all are valid.


//LINK: https://www.naukri.com/code360/problem-of-the-day/easy?leftPanelTabValue=PROBLEM