import java.util.*;
public class find_element_linkedlist {
    
	Node head=null;
	public static void main(String args[])
	{
		find_element_linkedlist list=new find_element_linkedlist();
		list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
		list = insert(list, 6); 
		printlist(list);
		System.out.println("Enter the number to find");
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		find(list,f);
		s.close();
	}
	public static find_element_linkedlist insert(find_element_linkedlist list,int data)
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
	public static void printlist(find_element_linkedlist list)
	{
		Node current=list.head;
		System.out.println("Linked list:");
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void find(find_element_linkedlist list,int f)
	{
		Node last;
		int flag=0;
		last=list.head;
		while(last.next!=null)
		{
			if(last.data==f)
			{
				flag=1;
				break;
			}
			last=last.next;
		}
		
		if(flag==1)
		{
			System.out.println("The element was found!!!");
		}
		else{
			System.out.println("The element was not found!");
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