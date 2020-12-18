import java.util.Scanner;
public class allpathstoleafnodes {
    static void preOrder(Node root)
  {
    if (root != null)
    {
      System.out.print(root.data + " ");
      preOrder(root.leftChild);
      preOrder(root.rightChild);
    }
  }
  static Node insertLevelOrder(int arr[], Node root, int i, int n)
  {
    if (i < n)
    {
      Node temp = new Node(arr[i]);
      root = temp;
      root.leftChild = insertLevelOrder(arr, root.leftChild, 2 * i + 1, n);
      root.rightChild = insertLevelOrder(arr, root.rightChild, 2 * i + 2, n);
    }
    return root;
  }

  static Node buildTree(int t[], int n)
  {
    Node node = null;
    node = insertLevelOrder(t, node, 0, n);
    return node;
  }
  static void printAllPaths(Node root) 
  {
    if(root==null)
      return;
    System.out.println(printAllPaths(root,0,new int[50]));
  }
static int printAllPaths(Node root,int len,int[] patharr)
{
  if(root==null)
    return 0;
  
  patharr[len]=root.data;
  len++;
  if(root.leftChild==null && root.rightChild==null)
  {
    for(int i=0;i<len;i++){
      System.out.print(patharr[i]+" ");
    }
    System.out.println(len-1);
    return 1;
  }
  return printAllPaths(root.leftChild,len,patharr)+printAllPaths(root.rightChild,len,patharr);
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
      root = buildTree(a, n);
    printAllPaths(root);
  }

static class Node
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
}