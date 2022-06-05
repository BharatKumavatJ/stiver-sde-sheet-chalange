import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
       
        
        ArrayList<Long> prev = new ArrayList<>();
        prev.add(1l);
        ans.add(prev);
  
        for(int i = 1; i < n; i++)
        {
            ArrayList<Long> temp = new  ArrayList<>();
            temp.add(1l);
            for(int j = 1; j < prev.size(); j++)
            {
                temp.add(prev.get(j) + prev.get(j - 1));
            }
            temp.add(1l);
            ans.add(temp);
            prev = temp;
        }
        
        return ans;
	}
}
