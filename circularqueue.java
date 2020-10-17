public class circularqueue {
    static int  size=5;
    static int front=-1,rear=-1;
    static int queue[]=new int[size];
    public static void main(String args[])
    {
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(10);
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(20);
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(30);
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(40);
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(50);
        System.out.println("thisssssss front="+front+" ,rear="+rear);
        dequeue();
        System.out.println("front="+front+" ,rear="+rear);
        dequeue();
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(1);
        System.out.println("front="+front+" ,rear="+rear);
        dequeue();
        System.out.println("front="+front+" ,rear="+rear);
        dequeue();
        System.out.println("front="+front+" ,rear="+rear);
        enqueue(2);
        System.out.println("\n The queue is:");
        display();
    }
    static void enqueue(int n)
    {
        if((rear==size-1&&front==1)||(rear==front-1))
        {
            System.out.println("queue overflow");
        }
        else if(rear==size-1&&front!=1)
        {
            rear=0;
            queue[rear]=n;
        }
       else if (front==-1&&rear==-1)
        {
            front++;
            queue[++rear]=n;
            System.out.println(n +" added to queue");
        }
        else{
            queue[++rear]=n;
            System.out.println(n +" added to queue");
        }
    }
    static int dequeue()
    {
        if((front==-1&&rear==-1))
        {
            System.out.println("queue underflow");
            return 0;
        }
        else{
            System.out.println("front"+front+" elsemet="+queue[front]);
            int x=queue[front];
            if(front==rear)
            {
                front=-1;
            }
            else if(front==size-1)
            {
                front=0;
            }
            else{
                front++;
            }
           System.out.println(x +"deleted from queue");
            return x;
        }
    }
    static void display()
    {
        if(rear>front)
        {
        for(int x=front;x<=rear;x++)
        {
            System.out.println(queue[x]);
        }
    }
    else{
        for(int i=front;i<size;i++)
        {
            System.out.println(queue[i]);
        }
        for(int i=0;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
        
    }
    }
}