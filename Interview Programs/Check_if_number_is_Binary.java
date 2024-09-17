import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isBinary(String bin) {
        // Write your code here.
        char [] ch = bin.toCharArray();
        boolean flag = false;
        for(char i:ch){
            if(i=='1'||i=='0'){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}


// Sample Input 1:
// 3
// 1000
// 20110
// 101013
// Sample Output 1:
// YES
// NO 
// NO
// Explanation of Sample Input 1:
// Test Case 1: 
// We see that the given string is “1000”. We can clearly see that all of the string elements are either ‘1’ or ‘0’. Therefore we return true and print YES in a new line.

// Test Case 2:
// We see that the given string is “20110”. We can clearly see that the first string is not a binary string as the first element of the string is a ‘2’ which is not a binary number. Therefore we return false and print “NO” in a new line.

// Test Case 3:
// We see that the given string is “101013”. We can clearly see that the first string is not a binary string as the last element of the string is a ‘3’ which is not a binary number. Therefore we return false and print “NO” in a new line.


//LINK : https://www.naukri.com/code360/problems/check-if-number-is-binary_1071951?interviewProblemRedirection=true&search=binary&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM