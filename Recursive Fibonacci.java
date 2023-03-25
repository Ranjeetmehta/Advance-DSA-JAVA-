https://course.acciojob.com/idle?question=af01e904-d5e6-4709-a91b-38f6819ae8ee


import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public int ClimbingStairs(int n) {
        // Write your code here
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		return ClimbingStairs(n-1)+ ClimbingStairs(n-2);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.ClimbingStairs(n));
    }
}
