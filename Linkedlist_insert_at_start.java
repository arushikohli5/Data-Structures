public class Linkedlist_insert_at_start {
    Node head=null;
     static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public static Linkedlist_insert_at_start insert(Linkedlist_insert_at_start list, int data)
    {
        Node new_node=new Node(data);
        new_node.next=null;
            if(list.head==null)
            {
                list.head=new_node;
            }
            else{
                new_node.next=list.head;
                list.head=new_node;
            }
            return list; 
        
    }
    public static void main(String args[])
    {
        Linkedlist_insert_at_start list=new Linkedlist_insert_at_start();
        list=insert(list,1);
        list=insert(list,2);
        list=insert(list,3);
        printlist(list);

    }
    public static void printlist(Linkedlist_insert_at_start list)
	{
		Node current=list.head;
		System.out.println("Linked list:");
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
    
}