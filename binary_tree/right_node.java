package binary_tree;
import java.util.*;
public class right_node {
  static int findRightSibling(Node root, int key) {
	if(root==null){
      return -1;
    }
     Queue <Node> qn=new LinkedList<Node>();
     Queue <Integer> q1=new LinkedList<Integer>();
    int l=0;
    q1.add(l);
    qn.add(root);
    while(qn.size()!=0){
      Node node=qn.peek();
      qn.remove();
      
      if(node.data==key){
        if(qn.size()==0)
        {
          return -1;
        }
        return qn.peek().data;
      }
      
      if(node.leftChild!=null){
        qn.add(node.leftChild);
      }
      if(node.rightChild!=null){
        qn.add(node.rightChild);
      }
    }
    return -1;
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
    int a[]=new int[50];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine());
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    i = s.nextInt();
    s.close();
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    System.out.println(findRightSibling(root, i));
  }
}

