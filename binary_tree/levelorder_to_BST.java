package binary_tree;
import java.util.Scanner;
public class levelorder_to_BST{
    static void inOrder(Node root)
  {
    if (root != null)
    {
      inOrder(root.leftChild);
      System.out.print(root.data + " ");
      inOrder(root.rightChild);
    }
  }
  public static void main(String[] args)
  {
    int a[]=new int[100];
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    s.close();
    Node root = null;
    if(n!=0)
      root = Result.buildSearchTree(a, n);
    inOrder(root);
  }
}
 class Result {
    static Node buildSearchTree(int t[], int n) {
      if(n==0)
      {
        return null;
      }
      Node root = null;
      for(int i=0;i<n;i++){
        root=LevelOrder(root,t[i]);
      }
      return(root);
    }
    static Node LevelOrder(Node root , int data){
      if(root==null){
        root=getNode(data);
        return root;
      }
      if(data<=root.data){
        root.leftChild=LevelOrder(root.leftChild,data);
      }
      else{
        root.rightChild=LevelOrder(root.rightChild,data);
      }
      return root;
    }
    static Node getNode(int data) {
      Node newNode=new Node();
      newNode.data = data; 
      newNode.leftChild = newNode.rightChild = null;  
      return newNode;
    }
  }
  class Node{
    int data;
    Node leftChild;
    Node rightChild;

    public Node(){
        data=0;
    }
    public Node(int d)
    {
        data=d;
    }
}