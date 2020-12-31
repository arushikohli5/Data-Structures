import java.util.*;
class QueueArray
{
  int SIZE=50;
  int front=-1;
  int rear=-1;
  int array[]=new int[SIZE];

  void enqueue(int item)
  {
    if (rear == SIZE) 
      return;
    if(front == -1 && rear == -1){
      front++;
      rear++;
    }
    else
      rear++;
    array[rear] = item;
  }

  int dequeue()
  {
    if (front==-1 || front > rear)
    {
      return -1;
    }
    int item = array[front];
    front++;
    return item;
  }  
}

class Reverse_first_N_elements
{
static void reverseKelementsQueue(QueueArray q, int K)
{
   int c=q.dequeue(),arr[]=new int[10],i=0;
  while(c!=-1)
  {
    arr[i++]=c;
    c=q.dequeue();
  }
  int n=i;
  for(i=K-1;i>=0;i--)
    q.enqueue(arr[i]);
  for(i=K;i<n;i++)
    q.enqueue(arr[i]);
}
public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2, k;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      QueueArray ob1=new QueueArray();
      n = Integer.parseInt(s.nextLine());
      k = Integer.parseInt(s.nextLine());
      q2=n;
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine());
        ob1.enqueue(q1);
        n--;
      }
      reverseKelementsQueue(ob1, k);
      while(q2>0)
      {
        System.out.print(ob1.dequeue() + " ");
        q2--;
      }
    System.out.println();
    t--;
    }
  }
}
