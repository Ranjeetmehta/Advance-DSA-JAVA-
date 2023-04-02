https://course.acciojob.com/idle?question=5ebeb2e9-0c47-4fd9-a7b9-5fbb1ecbe30b


import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
    }
}
class Node{
	int i;
	int j;
	int dist;
	Node(int i,int j,int dist){
		this.i=i;
		this.j=j;
		this.dist=dist;
	}
}
class Solution
{
    public int[][] nearest(int[][] grid)
    {
        // Code here
		int n=grid.length;
		int m = grid[0].length;
		int ans[][]=new int[n][m];
		boolean vis[][]=new boolean[n][m];
		Queue<Node> q=new LinkedList<>();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==1){
				q.add(new Node(i,j,0));	
					vis[i][j]=true;
			}
		}
		}
		int[] dx={0,1,0,-1};
		int[] dy={1,0,-1,0};
		while(!q.isEmpty()){
		Node node=q.poll();
		int r=node.i;
		int c=node.j;
		int dist=node.dist;
		ans[r][c]=dist;
		for(int i=0;i<4;i++){
			int dr=r+dx[i];
			int dc=c+dy[i];
			if(dr>=0 && dr<n && dc>=0 && dc<m && !vis[dr][dc]){
				q.add(new Node(dr,dc,dist+1));
				vis[dr][dc]=true;
			}	
		}
    }
		return ans;
}
}
