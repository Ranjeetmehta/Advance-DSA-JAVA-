https://course.acciojob.com/idle?question=e05b81ef-f938-48f7-8f15-b15e467bbd70


import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        //write code here
	        int N = nums.length, res = N + 1;
        long[] sum = new long[N + 1];
        for (int i = 0; i < N; i++)
            sum[i + 1] = sum[i] + nums[i];
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < N + 1; i++) {
            while (d.size() > 0 && sum[i] - sum[d.getFirst()] >= k)
                res = Math.min(res, i - d.pollFirst());
            while (d.size() > 0 && sum[i] <= sum[d.getLast()])
                d.pollLast();
            d.addLast(i);
        }
        return res <= N ? res : -1;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.shortestSubarray(nums, k));
        sc.close();
    }
}
