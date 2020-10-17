public class queue {
    static int  size=10;
    static int front=-1,rear=-1;
    static int queue[]=new int[90];
    public static void main(String args[])
    { 
        enqueue(10);
        enqueue(20);
        dequeue();
        dequeue();
        enqueue(50);
    }
    static void enqueue(int n)
    {
        if(rear==size-1)
        {
            System.out.println("queue overflow");
        }
       else if (front==-1&&rear==-1)
        {
            front++;
            rear=rear+1;
            queue[rear]=n;
            System.out.println(n +" added to queue");
        }
        else{
            queue[rear++]=n;
            System.out.println(n +" added to queue");
        }
    }
    static int dequeue()
    {
        if((front==-1&&rear==-1)||(front>rear))
        {
            System.out.println("queue underflow");
            return 0;
        }
        else{
            int x=queue[front];
            front++;
            System.out.println(x +"deleted from queue");
            return x;
        }
    }
}