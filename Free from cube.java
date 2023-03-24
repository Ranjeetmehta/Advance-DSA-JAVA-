https://course.acciojob.com/idle?question=ad209648-3f41-4de1-8f5b-43f27c00d9fe



import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Solution.isCubeFree(n);
        System.out.println(ans);
    }
}

class Solution {

    static int isCubeFree(int n) {

       // Write your code here
		List<Boolean> ans=new ArrayList<>(n+1);
		for(int i=0;i<=n;i++){
			ans.add(false);
		}
		int c=0;
		for(int i=2;i*i<=n;i++){
			if(!ans.get(i)){
				int k=i*i*i;
				for(int j=k;j<=n;j+=k){
					ans.set(j,true);
				}
			}
		}
		if(ans.get(n)) return -1;
		for(int i=1;i<=n;i++){
			if(!ans.get(i)) c++;
		}
		return c;
		
    }
}



