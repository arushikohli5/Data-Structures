public class join_Linkedlists {
    
	Node head=null;
	public static void main(String args[])
	{
        join_Linkedlists list=new join_Linkedlists();
        join_Linkedlists list2=new join_Linkedlists();
		list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list2= insert2(list2, 4); 
        list2= insert2(list2, 5); 
        list2= insert2(list2, 6);
        join(list,list2); 
		printlist(list);
	}
	public static join_Linkedlists insert(join_Linkedlists list,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			{
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=new_node;
			}
		}
		return (list);
    }
    public static join_Linkedlists insert2(join_Linkedlists list2,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		if(list2.head==null)
		{
			list2.head=new_node;
		}
		else
		{
			Node last=list2.head;
			{
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=new_node;
			}
		}
		return (list2);
    }
    public static join_Linkedlists join(join_Linkedlists list,join_Linkedlists list2)
    {
        Node last=list.head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=list2.head;
        return(list);
    }
	public static void printlist(join_Linkedlists list)
	{
		Node current=list.head;
		System.out.println("Linked list:");
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	static class Node
	{
		//Data Members
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}

	}
} 


















