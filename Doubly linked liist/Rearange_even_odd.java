import java.util.Scanner;
class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
  LinkList(int d)
  {
    data=d;
  }
}

class Rearange_even_odd
{
  static LinkList insertEnd(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList last = head;
    newLink.next = null;  
    if (head == null) 
    {
      head = newLink;
      newLink.prev = null;
      return head;
    }
    while (last.next != null) 
      last = last.next;
    last.next = newLink; 
    newLink.prev = last;
    return head;
  }

  static void traverse(LinkList first)
  {
    while (first != null)
    {
      System.out.print(first.data + " ");
      first = first.next;
    }
  }
  

  static LinkList rearrangeList(LinkList head)
  {
	if(head==null)
      return head;
    LinkList temp=head,new_head=null,tempnh=new_head;
    while(temp!=null&&temp.next!=null)
    {
      if(new_head==null)
      {
        new_head=temp.next;
        tempnh=new_head;
        temp.next.prev=null;
      }
      else{
        tempnh.next=temp.next;
        temp.next.prev=tempnh;
        tempnh=temp.next;
      }
      temp.next=temp.next.next;
      if(temp.next!=null)
      {
        temp.next.prev=temp;
      }
      temp=temp.next;
    }
    tempnh.next=head;
    return(new_head);
  }
  public static void main(String[] args)
  {
    int t,n,m,x,y;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      LinkList head = null, t1, t2;
      n=Integer.parseInt(s.nextLine());
      while(n>0)
      {
        m=Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      t1 = rearrangeList(head);
      traverse(t1);
      System.out.println();
      t--;
    }
  }
}
