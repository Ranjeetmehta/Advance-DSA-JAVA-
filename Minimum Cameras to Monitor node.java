 question link   https://course.acciojob.com/idle?question=7b3236c6-eb31-4ee3-8145-80fba275086c


import java.util.*;
import java.lang.*;
import java.io.*;


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

class Main
{
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node''''s value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }


    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String s = br.readLine();
        Node root = buildTree(s);
    
        Solution g = new Solution();
        int ans=g.solve(root);

        System.out.println(ans);
    
    }
}

class Solution
{
	int cam=0;
	Set<Node> covered;
	
    int solve(Node root)
    {
		covered=new HashSet<>();
		covered.add(null);
		dfs(root,null);
		return cam;
	}
	public void dfs(Node node,Node par){
		if(node==null) return;
		dfs(node.left,node);
		dfs(node.right,node);
		if(par==null && !covered.contains(node) || !covered.contains(node.left) ||!covered.contains(node.right)){
			cam++;
			covered.add(node);
				covered.add(node);
				covered.add(node.left);
				covered.add(node.right);
				covered.add(par);
		}
	}
// Your code here	    
    }

