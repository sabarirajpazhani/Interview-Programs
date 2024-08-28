class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        for(int i=0;i<r;i++){
            ArrayList<Integer> a1=new ArrayList<>();
            for(int j=0;j<c;j++){
                a1.add(a[i][j]);
            }
            if(!arr.contains(a1)){
                arr.add(a1);
            }
        }
        return arr;
    }
}

// Input:
// row = 3, col = 4 
// M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
// Output: $1 1 0 1 $1 0 0 1 $
// Explanation: Above the matrix of size 3x4
// looks like
// 1 1 0 1
// 1 0 0 1
// 1 1 0 1
// The two unique rows are R1: {1 1 0 1} and R2: {1 0 0 1}. 
// As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.