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

class rotate_elements
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

static LinkList rotateByK(LinkList head, int k)
{
 int count=0;
  if(k==0||head==null)
  {
    return head;
  }
  LinkList current=head,last=head;
  while(last.next!=null)
  {
    last=last.next;
    current=current.next;
  }
  while(count<k)
  {
    LinkList temp=last;
    last=last.prev;
    last.next=null;
    temp.next=head;
    head.prev=temp;
    head=temp;
    temp.prev=null;
    count++;
  }
  return head;
}
public static void main(String[] args)
  {
    int t,n,m,x,y;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      LinkList head = null, t1, t2;
      n=Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        m=Integer.parseInt(s.nextLine().trim());
        head = insertEnd(head, m);
        n--;
      }
      x=Integer.parseInt(s.nextLine().trim());
      t1 = rotateByK(head, x);
      traverse(t1);
      System.out.println();
      t--;
    }
  }
}
