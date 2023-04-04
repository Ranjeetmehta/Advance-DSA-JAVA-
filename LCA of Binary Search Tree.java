https://course.acciojob.com/idle?question=a565901c-8445-4cb5-8e0a-364907fef51e

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length)
                break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int p = sc.nextInt();
        int q = sc.nextInt();
        Node root = buildTree(s);
        Solution g = new Solution();
        sc.close();
        Node ans = g.LCA(root, p, q);
        System.out.print(ans.data);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    Node LCA(Node node, int n1, int n2)
    {
       // Your code here
		if(node==null) return node;
		if(node.data<n1 && node.data<n2) return LCA(node.right,n1,n2);
		if(node.data>n1 && node.data>n2) return LCA(node.left,n1,n2); 
		
		return node;
    }
}






