import java.util.*;

class QueueArray
{
  int SIZE = 100;
  int front = 0;
  int rear = 0;
  int array[] = new int[SIZE];

  // Method to add an item to the queue.
  void enqueue(int item)
  {
    if (rear == SIZE)   // Queue is full
      return;
    if(front == 0 && rear == 0)
      front = rear = 1;
    else
      rear++;
    array[rear] = item;
  }

  // Method to remove an item from queue.
  int dequeue()
  {
    if (front > rear)
      return -1;
    int item = array[front];
    front++;
    return item;
  }
}
class NewStack
{
  void push(QueueArray q1, QueueArray q2, int item)
  {
    int c=q1.dequeue();
    while(c!=-1){
      q2.enqueue(c);
      c=q1.dequeue();
    }
    q1.enqueue(item);
    c=q2.dequeue();
    while(c!=-1){
      q1.enqueue(c);
      c=q2.dequeue();
    }
  }

  int pop(QueueArray q1, QueueArray q2)
  {
   int c=q1.dequeue();
    if(c==0)
      return -1;
    return c;
  }
}
class StackUsing2queues
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2, k;
    t = Integer.parseInt(s.nextLine());
    NewStack st1 = new NewStack();
    QueueArray qa1=new QueueArray();
    QueueArray qa2=new QueueArray();
    while(t>0)
    {
      q1 = s.nextInt();
      if(q1 == 1)
      {
        q2 = s.nextInt();
        st1.push(qa1, qa2, q2);
      }
      else
      {
        System.out.print(st1.pop(qa1, qa2) + " ");
      }
      t--;
    }
    System.out.println();
  }
}
