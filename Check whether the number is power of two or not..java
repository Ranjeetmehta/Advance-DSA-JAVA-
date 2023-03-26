https://course.acciojob.com/idle?question=4f0300b9-a314-4598-b0d1-9725812d3c1c

import java.util.*;

public class Main {

    public static boolean checkPowerofTwo(int n){
        //Write your code here
		if(n==1) return true;
		else if(n%2!=0 || n==0){
			return false;
		}
		return checkPowerofTwo(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(checkPowerofTwo(n))System.out.println("true");
        else System.out.println("false");

    }
}
