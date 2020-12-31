import java.util.*;
class QueueNode
{
  int data;
  QueueNode next;

  public QueueNode(int data) 
  {
    this.data = data;
  }
}

class QueueLinkedList
{
  public QueueNode front,rear;
  public QueueLinkedList(){
    this.front=this.rear=null;
  }
  /*  Function to EnQueue an element to the Queue */
  public void EnQueue(int data)
  {
    QueueNode temp=new QueueNode(data);
	if(this.rear==null)
    {
      this.front=this.rear=temp;
    }
    else{
      this.rear.next=temp;
      this.rear=temp;
    }
  }    
  public int DeQueue()
  {
	int x;
    if(this.front==null)
    {
      return -1;
    }
    else{
      x=this.front.data;
      this.front=this.front.next;
    }
    if(this.front==null)
      this.rear=null;
    return x;
  }    
}
