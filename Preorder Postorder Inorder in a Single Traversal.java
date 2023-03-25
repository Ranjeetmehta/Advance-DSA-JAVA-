 question link  https://course.acciojob.com/idle?question=e4bec89a-4907-4b75-9ff7-f9defb7ba20f



import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
       // System.out.print(str);
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    Scanner sc = new Scanner(System.in);
            
			String s = sc.nextLine();
            
            //System.out.print(s);
			Node root = buildTree(s);
			Solution tree = new Solution();
			tree.preorder(root);
		System.out.println();
		    tree.inorder(root);
		System.out.println();
		     tree.postorder(root);
            
		
	}
}
  


class Solution {
	public static void preorder(Node root){
			
        if(root==null) return;
		
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
public static void inorder(Node root){
			if(root==null) return;
	    inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);

	
}

public static void postorder(Node root) {
	if(root==null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
}
// 	public static void allTraversal(Node root) {
// 		//Write your code here 

// 		tree.preorder(root);
// 		tree.inorder(root);
// 		tree.postorder(root);
		
//   //       if(root==null) return;
		
// 		// System.out.print(root.data + " ");
// 		// allTraversal(root.left);
// 		// allTraversal(root.right);


// // 		//for in order
//   //       allTraversal(root.left);
// 		// System.out.print(root.data+ " ");
// 		// allTraversal(root.right);
// 		// System.out.println();
		

// //for post order
// 		// allTraversal(root.left);
// 		// allTraversal(root.right);
// 		// System.out.print(root.data + " ");

// 	}
}
