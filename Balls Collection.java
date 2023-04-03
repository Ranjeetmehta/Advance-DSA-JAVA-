https://course.acciojob.com/idle?question=ac06a1ec-760d-43ad-a783-77739f378209


import java.io.*;
import java.util.*;

class Solution {

    public int arrange(int n,String[] balls, int[] travel) {
        // write code here

		HashMap<Character,Integer> mp = new HashMap<>();
		int ans =0;
		for(int i =0;i<n;i++){
			ans += balls[i].length();
			for(int j =0;j<balls[i].length();j++){
				char c =balls[i].charAt(j);
				mp.put(c,i);	
			}
		}
		for(int j = 1;j<travel.length;j++){
			travel[j] += travel[j-1];
		}
		for(char c: mp.keySet()){
			if(mp.get(c)>0)
				ans += travel[mp.get(c) - 1];
		}
		return ans;
    }

            }


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] arr= new String[n];
        int[] travel = new int[n-1];
        for(int i=0;i<n;i++)
            arr[i] = sc.next();
        for(int i=0;i<n-1;i++)
            travel[i] = sc.nextInt();   
        sc.close();
        Solution Obj = new Solution();
        System.out.print(Obj.arrange(n,arr,travel));
    }
}

