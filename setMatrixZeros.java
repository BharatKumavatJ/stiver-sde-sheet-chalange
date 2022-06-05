import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            
             for(int j = 0; j < m; j++)
             {
               if(row.contains(i))
               {
                    matrix[i][j] = 0;
               }
               if(col.contains(j))
               {
                    matrix[i][j] = 0;
               }
             }
        
        }
        
    }

}