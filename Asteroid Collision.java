   Question link   https://course.acciojob.com/idle?question=4d8f93dd-693d-43a3-b3d1-2fcbad36d2ff


import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] arr) {
        //Write code here
		Stack<Integer> s = new Stack<>();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] > 0) s.push(arr[i]); else {
        while (
          !s.empty() && s.peek() > 0 && s.peek() < Math.abs(arr[i])
        ) s.pop();
        if (!s.empty() && s.peek() == Math.abs(arr[i])) {
          s.pop();
          continue;
        }
        if (s.empty() || s.peek() < 0) s.push(arr[i]);
      }
    }

    int[] result = new int[s.size()];
    int k = 0;
    while (!s.empty()) {
      result[k++] = s.pop();
    }
    for (int i = 0; i < result.length / 2; i++) {
      int temp = result[i];
      result[i] = result[result.length - i - 1];
      result[result.length - i - 1] = temp;
    }
return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.asteroidCollision(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}
