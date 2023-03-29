https://course.acciojob.com/idle?question=0b474ed5-9d42-4b71-bbb7-7424d139805c





import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public static int diffPossible(int[] A, int B) {
        //Write your code here  
		int i=0,j=1;
		int n=A.length;
		while(j<n){
		int	diff=A[j]-A[i];
			if(diff==B) return 1;
			else if(diff<B) j++;
			else if(diff > B) i++;
				if(i==j) j++;
		}
		return 0;
    }
}
public class Main {
	 public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);		    
		    	int n = sc.nextInt();
				int[] A = new int[n];
				for(int i=0;i<n;i++)
				A[i] = sc.nextInt();
				int k= sc.nextInt();           
	    	Solution Obj= new Solution();	    	
            System.out.println(Obj.diffPossible(A, k));
	}
}
