import java.util.*;


public class LevelOrder_Traversal {
    static class Node{
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




  static void printLevelWise(Node root){
      if(root==null)
      {
          return;
      }
      Queue<Node> q=new LinkedList<Node>();
      q.add(root);
      int c=q.size();
      while(true){
          while(c>0){
              Node n=q.peek();
              System.out.print(n.data+" ");
              q.remove();

              if(n.leftChild!=null){
                  q.add(n.leftChild);
              }
              if(n.rightChild!=null)
              {
                  q.add(n.rightChild);
              }
              c--;
          }
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
      root = buildTree(a, n);
    printLevelWise(root);
  }
}
