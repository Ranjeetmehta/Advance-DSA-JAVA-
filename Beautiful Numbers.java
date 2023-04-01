https://course.acciojob.com/idle?question=3371df0b-df51-42c0-b0ca-e908eb7a031f


import java.util.Scanner;
import java.util.Arrays;

class Solution{
    public static void solve(int n, int[] arr) {
       // Your code here
		int[] ans=new int[n+1];
		for(int i=0;i<n;i++){
			ans[arr[i]]=i;
		}
		int left=n,right=0;
		String mp="";
		for(int i=1;i<=n;i++){
			left=Math.min(left,ans[i]);
			right=Math.max(right,ans[i]);
			if(right-left+1==i)
				mp+='1';
			else
				mp+='0';
		}
		System.out.println(mp);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Solution.solve(n, arr);
    }
}
