https://course.acciojob.com/idle?question=8ece7d1c-895e-4584-b084-64f1032d0611


import java.util.*;
class Solution{
    static int[] par;
	public static int findpar(int u){
		if(par[u]==u) return u;
		return par[u]=findpar(par[u]);
	}
	
    
    public static int makeConnected(int n , int[][] connections){
        //write your code here
		if(n-1 > connections.length){
			return -1;
		}
		par=new int[n];
		for(int i=0;i<n;i++){
			par[i]=i;
		}
		for(int[] connection:connections){
			int u=connection[0];
			int v=connection[1];
			int p1=findpar(u);
			int p2=findpar(v);
			if(p1!=p2){
				par[p2]=p1;
			}
		}
		int comp=0;
		for(int i=0;i<n;i++){
			int p=findpar(i);
			if(p==i){
				comp++;
			}
		}
        return comp-1;
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
