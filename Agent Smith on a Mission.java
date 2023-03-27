https://course.acciojob.com/idle?question=586b5286-6672-4f27-98ec-27702c4606e6

import java.io.*;
import java.util.*;

class Solution {
    ArrayList<Integer> missingElement(int A[], int n,int B[],int m)
    {
		ArrayList<Integer> ans =new ArrayList<>();
        // Your code here
		int j;
		for(int i=0;i<n;i++){
			for(j=0;j<m;j++){
		     if(A[i]==B[j])
			break;
			}
			if(m==j)
				ans.add(A[i]);
				
		
    }
		return ans;
}
		}
	
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int M = sc.nextInt();

        int A[]=new int[N];
        int B[]=new int[M];

        for(int i=0;i<N;i++)
        A[i]=sc.nextInt();

        for(int i=0;i<M;i++)
        B[i]=sc.nextInt();
        
        Solution ob = new Solution();
        ArrayList<Integer> ans= ob.missingElement(A,N,B,M);
        
        for(int x:ans)
        System.out.print(x+" ");

        System.out.println();
    
    }
}
