import java.util.*;
public class LinkedList 
{
	Node head=null;
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list = insert(list, 6); 
		list = insert(list, 2); 
		list = insert(list, 3); 
        list = insert(list, 4); 
		list = insert(list, 5); 
		printlist(list); 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the postion where to insert");
		int position=s.nextInt();
		list=insert_in_between(list,10,position);
		printlist(list);
		s.close();
	}
	public static LinkedList insert(LinkedList list,int data)
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
	public static LinkedList insert_in_between(LinkedList list,int data,int position)
	{
		Node new_node=new Node(data);
		int index=0;
		Node current=list.head;
		if(list.head==null)
		{
			System.out.println("List is empty");
			return (list);
		}

		while(position>index&&list.head!=null)
		{
			current=current.next;
			index++;
		}
		if(current==null)
		{
			System.out.println("Invalid input");
		}
		else
		{
			new_node.next=current.next;
			current.next=new_node;

		}
		return(list);
	}
	public static void printlist(LinkedList list)
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
