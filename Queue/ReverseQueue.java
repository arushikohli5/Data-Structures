import java.util.*;
class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  void enqueue(int item)
  {
    if (rear == SIZE)   // Queue is full
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
    if (front > rear)
    {
      return -1;
    }
    int item = array[front];
    front++;
    return item;
  }  
}

class ReverseQueue
{
static void reverseQueue(QueueArray q)
{
  int c=q.dequeue();
  int arr[]=new int[10];
  int i=0;
  while(c!=-1)
  {
    arr[i++]=c;
    c=q.dequeue();
  }
  for(int n=i-1;n>=0;n--)
    q.enqueue(arr[n]);
  System.out.println();
}
public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  int t, n, q1, q2;
  t = s.nextInt();
  while(t>0)
  {
    QueueArray ob1=new QueueArray();
    n = s.nextInt();
    q2=n;
    while(n>0)
    {
      q1 = s.nextInt();
      ob1.enqueue(q1);
      n--;
    }
    reverseQueue(ob1);
    while(q2>0)
    {
      System.out.print(ob1.dequeue() + " ");
      q2--;
    }
    t--;
  }
  System.out.println();
}
}
