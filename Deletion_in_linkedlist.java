import java.util.*;
public class Deletion_in_linkedlist {
    
	Node head=null;
	public static void main(String args[])
	{
		Deletion_in_linkedlist list=new Deletion_in_linkedlist();
		list = insert(list, 7); 
		list = insert(list, 23); 
		list = insert(list, 34);                                                                                                
        list = insert(list, 48); 
		list = insert(list, 50); 
		printlist(list); 
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the element to delete");
        int del=scan.nextInt();
        list=delete(list,del);
        printlist(list);
        int key=scan.nextInt();
        list=delbykey(list,key);
        printlist(list);
    }
    public static Deletion_in_linkedlist delbykey(Deletion_in_linkedlist list,int key)
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
	public static Deletion_in_linkedlist insert(Deletion_in_linkedlist list,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(list.head==null)
		{
			list.head=newnode;
		}
		else
		{
			Node last=list.head;
			{
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newnode;
			}
		}
		return (list);
	}
	public static Deletion_in_linkedlist delete(Deletion_in_linkedlist list,int del)
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
	public static void printlist(Deletion_in_linkedlist list)
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
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}

	}
} 