import java.util.Scanner;
public class in_post_preorder {
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
  static void inorder(Node root)
  {
    if(root==null){
      return;
    }
    if(root.leftChild!=null)
    {
     inorder(root.leftChild); 
    }
    System.out.print(root.data+" ");
    if(root.rightChild!=null)
    {
      inorder(root.rightChild);
    }
      
  }
  static void preorder(Node root)
  {
    if(root==null){
      return;
    }
    System.out.print(root.data+" ");
    preorder(root.leftChild);
    preorder(root.rightChild);
  }
  static void postorder(Node root)
  {
    if(root==null){
      return;
    }
    postorder(root.leftChild);
    postorder(root.rightChild);
    System.out.print(root.data+" ");
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
    inorder(root);
    System.out.println();
    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
  }
}
