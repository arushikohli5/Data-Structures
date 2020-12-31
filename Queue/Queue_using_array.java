import java.util.*;

class Queue_using_array
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  Queue_using_arra()
  {
    front=rear=-1;
  }
  void enqueue(int item)
  {
    
    if(rear==-1&&front==-1)
    {
      rear++;
      front++;
      array[rear]=item;
    }
    else if(rear!=SIZE-1)
    {
      array[++rear]=item;
    }
  }
  int dequeue()
  {
    if(front>rear)
      return -1;
    return array[front++];
      
  }
}
