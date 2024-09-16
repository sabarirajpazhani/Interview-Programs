import java.util.*;
public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        int x=-1;
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(e.getValue()==1){
                x=e.getKey();
            }
        }
        return x;
    }
}


