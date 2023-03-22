   // Question link          https://course.acciojob.com/idle?question=534881ae-c8f8-4639-a07f-023ca94000d8




import java.util.*;

class Solution {
    public int canCompleteCircuit(int[] A, int[] B) {
        //Write code here
		int sumOfGas=0,sumOfCost=0,tank=0,st=0;
		int n=A.length;
		for(int i=0;i<n;i++){
			sumOfGas+=A[i];
			sumOfCost+=B[i];
			tank+=A[i]-B[i];
			if(tank<0){
				tank=0;
				st=i+1;
			}
		}
		return sumOfGas>=sumOfCost ? st: -1;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = input.nextInt();
        for (int i = 0; i < n; i++)
            B[i] = input.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.canCompleteCircuit(A, B));
        input.close();
    }
}
