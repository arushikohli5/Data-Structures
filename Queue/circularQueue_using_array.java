import java.util.*;
class QueueArray
{
  static int SIZE=4;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];

  void enqueue(int item)
  {
	if((front==0&&rear==SIZE-1)||(rear+1)%SIZE==front)
    {
      return;
    }
    if(front==-1 &&rear==-1)
    {
      front=rear=0;
    }
    else if(rear == SIZE-1 && front != 0)
    {
      rear=0;
    }
    else {
      rear++;
    }
    array[rear]=item;
  }

  int dequeue()
  {
	if(front==-1)
    {
      return -1;
    }
    int item=array[front];
    if(front==rear)
    {
      front=rear=-1;
    }
    else if(front==SIZE-1)
    {
      front=0;
    }
    else
      front++;
    return item;
  }
  
  }

class Main
{
  public static void main(String[] args)
  {
    QueueArray ob1=new QueueArray();
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
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
          ob1.enqueue(q2);
        }
        else
          System.out.print(ob1.dequeue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}
