https://course.acciojob.com/idle?question=504c7464-d786-42b5-8807-4ff8e3b64918



import java.util.*;
class Solution{
    
    
    public static int makeConnected(int n , int[][] connections){
        //write your code here
        
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] edges = new int[m][2] ; 
        for(int i = 0 ; i < m ; ++i){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        System.out.print(Solution.makeConnected(n,edges));
    }
}
