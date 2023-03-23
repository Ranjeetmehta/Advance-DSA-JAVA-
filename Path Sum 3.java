  question link   https://course.acciojob.com/idle?question=4bb9061f-b7f2-4eae-aca5-d8a6e17335f8


import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution{
        

    public static int pathSum(TreeNode root, int sum) {
        //Write your code 

		if(root==null)
			return 0;
		return helper(root,sum) + pathSum(root.left,sum)+pathSum(root.right,sum);
		
       
    }
	public static int helper(TreeNode root,int sum){
		if(root==null) return 0;
		int ans=0;
		if(root.data==sum)
			ans=1;
		return ans + helper(root.left,sum-root.data) +helper(root.right,sum-root.data);
	}

}



class Main {
    public static TreeNode buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N')
            return null;

        String[] nodes = str.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {

            TreeNode currNode = queue.poll();

            String currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= nodes.length)
                break;
            currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum= sc.nextInt();
        TreeNode root = buildTree(s);
        int maxPath = Solution.pathSum(root,sum);
        System.out.println(maxPath);
    }
}
