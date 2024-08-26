class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int n1=(n*(n+1))/2;
        int s=0;
        for(int i:arr){
            s+=i;
        }
        return n1-s;
    }
}


// Input: n = 5, arr[] = [1,2,3,5]
// Output: 4
// Explanation : All the numbers from 1 to 5 are present except 4.
// Input: n = 2, arr[] = [1]
// Output: 2
// Explanation : All the numbers from 1 to 2 are present except 2.