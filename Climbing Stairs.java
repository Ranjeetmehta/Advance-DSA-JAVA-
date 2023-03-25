 Question link    https://course.acciojob.com/idle?question=339b28b9-971f-4316-aede-7b9e0f20934f

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
