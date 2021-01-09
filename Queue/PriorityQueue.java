import java.util.*;
class QueueNode
{
  int data;
  int priority;
  QueueNode next;

  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
}
/* class QueueNode
{
  int data;
  int priority;
  QueueNode next;
  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
} is provided to you. */ 

class PQueueLL
{
  public QueueNode front, rear;
  
  PQueueLL(){
    front=rear=null;
  }
  
  public void EnQueue(int data, int priority)
  {
    QueueNode n=new QueueNode(data,priority);
    n.next=null;
    if(front==null)
    {
      rear=front=n;
    }
    else if(front.priority>priority)
    {
      n.next=front;
      front=n;
    }
    else{
      QueueNode temp=front;
      while(temp!=null&&temp.next!=null&&temp.next.priority<priority)
      {
        temp=temp.next;
      }
      n.next=temp.next;
      temp.next=n;
    }
  }    

  public int DeQueue()
  {
    if(front==null)
    {
      return -1;
    }
    else{
      int x=front.data;
      front=front.next;
      return x;
    }
  }    
}
class PriorityQueue
{
  public static void main(String[] args)
  {
    PQueueLL q=new PQueueLL();
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2, q3;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      n = Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine().trim());
        if(q1 == 1)
        {
          q2 = Integer.parseInt(s.nextLine().trim());
          q3 = Integer.parseInt(s.nextLine().trim());
          q.EnQueue(q2, q3);
        }
        else
          System.out.print(q.DeQueue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}
