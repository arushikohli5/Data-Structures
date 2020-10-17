import java.util.*;
public class deletionll {
    
	Node head=null;
	public static void main(String args[])
	{
		deletionll list=new deletionll();
		list = insert(list, 6); 
		list = insert(list, 2); 
		list = insert(list, 3);                                                                                                
        list = insert(list, 4); 
		list = insert(list, 5); 
		printlist(list); 
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the element to delete");
        int del=s.nextInt();
        list=delete(list,del);
        printlist(list);
        //delete by key
        int key=s.nextInt();
        list=delbykey(list,key);
        printlist(list);
		s.close();
	}
	
    public static deletionll delbykey(deletionll list,int key)
    {
        int i=1;
        Node prev=null,current=list.head;
        if(list.head==null)
        {
            System.out.println("list is empty");
            return list;
		}
        while(i<key&&current!=null)
        {
            prev=current;
            current=current.next;
            i++;
        }
        if(current==null)
        {
            System.out.print("the size of linked list is shotter than the input");
            return list;
        }
        else
        {
            prev.next=current.next;
        }
        return list;
    }
	public static deletionll insert(deletionll list,int data)
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
	public static deletionll delete(deletionll list,int del)
	{
	
        Node current=list.head,prev=null;
        if(list.head==null)
        {
            System.out.println("list is empty");
            return list;
        }
		if(current.data==del&&current!=null)
		{
			list.head=current.next;
			return (list);
		}
		while(current.data!=del&&current!=null)
		{
            prev=current;
			current=current.next;
		}
		if(current==null)
		{
            System.out.println("Invalid input");
            return list;
		}
		else
		{
			prev.next=current.next;
        }
		return(list);
	}
	public static void printlist(deletionll list)
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