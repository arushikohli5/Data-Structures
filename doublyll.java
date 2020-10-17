public class doublyll{
    Node head;
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int d)
        {
            data=d;
        }
    }
    public static void main(String args[])
    {
        doublyll list=new doublyll();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.printlist(list.head);
    }
    public void insert(int data)
    {
        //insert at start
        Node new_node=new Node(data);
        new_node.next=head;
        new_node.prev=null;
        if(head==null)
        {
            head=new_node;
        }
        else{
            head.prev=new_node;
            head=new_node;
        }

    }
    public void printlist(Node head)
    {
       Node current=head;
        System.out.println("LL is:");
        while(current!=null)
        {
            current=current.next;
            System.out.println(current.data);
        }
    }
}