 QUEstion link   https://course.acciojob.com/idle?question=09fc4541-95da-4be3-8c19-875d32fe59c1
 
 
 
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
        
  public static int maxSum=0;
    public static int maxPathSum(TreeNode root) {
        //Write your code
		if(root==null) return 0;
	int rootSum=root.data;
	int	leftSum=maxPathSum(root.left );
	int rightSum=maxPathSum(root.right);
     int max=rootSum+leftSum+rightSum;
		maxSum=Math.max(maxSum,max);
		return Math.max(Math.max(leftSum,rightSum)+rootSum,rootSum);
		
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
        TreeNode root = buildTree(s);
        int maxPath = Solution.maxPathSum(root);
		
        System.out.println(Solution.maxSum);
    }
}
