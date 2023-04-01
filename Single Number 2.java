https://course.acciojob.com/idle?question=b3a170ff-5ddf-4391-b5ed-6739962d563e




import java.util.*;

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int []nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int[] ans=ob.singleNumber(nums);
            System.out.println(Math.min(ans[0],ans[1])+" "+Math.max(ans[1],ans[0]));
		}
			
	}
}


class Solution {
    public int[] singleNumber(int[] nums) {
        // Your Code Here
		int x=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
			x^=nums[i];
		}
		int mask=1;
		while((mask & x)==0)
			mask=mask<<1;
		int b1=0,b2=0;
		for(int i=0;i<n;i++){
			if((nums[i] & mask) !=0)
				b1^=nums[i];
			else
				b2^=nums[i];
		}
		return new int[]{b1,b2};
		


    }
}
