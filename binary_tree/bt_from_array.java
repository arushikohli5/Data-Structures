package binary_tree;
/*import java.util.*;

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
public class bt_from_array {
    public static void main(String args[]){
        int a[]=new int[100];
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        Node root=null;
        root=buildTree(a,n);
        inorder(root);
    }

    

    static void inorder(Node root){

        if (root != null){
            inorder(root.leftChild);
            System.out.print(root.data + " ");
            inorder(root.rightChild);
        }
    }

    static Node buildTree(int t[], int n){
        return buildTree(t,n,0);
    }

    static Node buildTree(int t[],int n,int i){
        Node node=new Node(t[i]);

        if(i>=n)
        {
            return node;
        }
        node.leftChild=buildTree(t,n,2*i+1);
        node.rightChild=buildTree(t,n,2*i+2);
        return node;
    }
}
*/
import java.util.Scanner;
class Node
{
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()
  {
    data=0;
  }
  public Node(int d)
  {
    data=d;
  }
}

class bt_from_array
{
  static void inOrder(Node root)
  {
    if (root != null)
    {
      inOrder(root.leftChild);
      System.out.print(root.data + " ");
      inOrder(root.rightChild);
    }
  }
  /* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
} Above class is declared for use. */

static Node buildTree(int t[], int n)
{
  return buildTree(t,n,0);
}
static Node buildTree(int t[], int n,int i)
{
  Node node=null;
  if(i>=n)
    return node;
  node=new Node(t[i]);
  node.leftChild=buildTree(t,n,2*i+1);
  node.rightChild=buildTree(t,n,2*i+2);
  return node;
}
public static void main(String[] args)
  {
    int a[]=new int[10];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = s.nextInt();
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    Node root = null;
    root = buildTree(a, n);
    inOrder(root);
  }
}