https://course.acciojob.com/idle?question=c6e5e940-4699-46ef-85f8-9908dc6614de




import java.util.*;
class Solution {

	static int countways(int n)
	{
		// Your code here
		if(n==1) return 0;
		if(n%2==0) return 1+countways(n/2);
		else
			return 1+Math.min(countways(n-1),countways(n+1));
	}
}

public class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(Solution.countways(n));
	}
}
