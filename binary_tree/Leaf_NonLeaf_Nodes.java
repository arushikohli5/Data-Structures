import java.util.Scanner;
public class Leaf_NonLeaf_Nodes {
        static int countLeafs(Node root) {
          if(root==null){
            return 0;
          }
          if(root.leftChild==null&&root.rightChild==null){
            return 1;
          }
          
          return 0+countLeafs(root.leftChild)+countLeafs(root.rightChild);
            
        }
      
        static int countNonLeafs(Node root) 
        {
          if(root==null||(root.leftChild==null&&root.rightChild==null))
          {
            return 0;
          }
          return 1+countNonLeafs(root.leftChild)+countNonLeafs(root.rightChild);
        }

      static class Node
      {
          Node leftChild;
          Node rightChild;
          int data;
          public Node(){
            data=0;
          }
           public Node(int d){
            data=d;
    }
}

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
    System.out.print(countLeafs(root) + " " + countNonLeafs(root));
  }
}

