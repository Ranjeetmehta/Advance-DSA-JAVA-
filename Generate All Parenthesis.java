https://course.acciojob.com/idle?question=117d315f-d2e8-4eb8-9e68-bd2322a59f84





import java.io.*;
import java.util.*;
class Solution{
	public static void helper(int open ,int close,String ans){
		if(open==0 && close==0){
			System.out.println(ans);
			return;
		}

			if(open!=0)
				helper(open-1,close,ans+'(');
			if(close>open)
				helper(open,close-1,ans+')');
	}
     public static void generateParanthesis(int n){
        // write code here
		 String ans="";
		 helper(n,n,ans);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Solution obj=new Solution();
        obj.generateParanthesis(n);
    }
}
