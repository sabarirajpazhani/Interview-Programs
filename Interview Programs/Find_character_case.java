import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		char ch = str.charAt(0);
		if(Character.isLetter(ch)){
			if('A'<ch && 'Z'>ch){
				System.out.println(1);
			}
			else{
				System.out.print(0);
			}
		}
		else{
			System.out.print(-1);
		}
		
	}
}


// Sample Input 1 :
// v
// Sample Output 1 :
// 0
// Explanation of Sample Input 1:
// v is a lower case alphabet hence the output is 0.
// Sample Input 2 :
// V
// Sample Output 2 :
// 1


//LINK: https://www.naukri.com/code360/problems/find-character-case_1115655?interviewProblemRedirection=true&page=3&leftPanelTabValue=PROBLEM