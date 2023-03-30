https://course.acciojob.com/idle?question=edd1121c-c07c-41db-b1d1-685dd1ed160e

import java.util.*;


class Solution {
    
    public static void minSubArrayLen(int arr[], int k, int n) {
        //Write your code here
		int i=0,j=0,ans=Integer.MAX_VALUE,sum=0;
		while(i<=j && j<n){
			sum+=arr[j];
			while(sum>k){
				ans=Math.min(ans,j-i+1);
				sum-=arr[i];
				i++;
			}
			j++;
		}
		if(ans==Integer.MAX_VALUE)
			System.out.println(0);
		else
        System.out.println(ans);

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Solution.minSubArrayLen(arr,target,n);
        
    }
}
