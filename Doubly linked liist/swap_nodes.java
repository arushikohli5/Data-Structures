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

class swap_nodes
{
  LinkList head;
  LinkList insertEnd(int data)
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

  void traverse()
  {
    while (head != null)
    {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }
  
  void swapNodes(int x, int y)
{
	LinkList prevx=null,curx=head,prevy=null,cury=head;
  if(head==null||x==y)
  {
    return;
  }
  while(curx!=null&&curx.data!=x)
  {
    prevx=curx;
    curx=curx.next;
  }
  while(cury!=null&&cury.data!=y)
  {
    prevy=cury;
    cury=cury.next;
  }
  if(cury==null||curx==null)
  {
    return;
  }
    if(prevx!=null)
    {
      prevx.next=cury;
    }
    else
      head=cury;
    if(prevy!=null)
    {
      prevy.next=curx;
    }
    else
      head=curx;
    curx.prev=prevy;
    cury.prev=prevx;
     LinkList temp=curx.next;
  curx.next=cury.next;
  cury.next=temp;
  }
public static void main(String[] args)
  {
    int t,n,m,x,y;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Main o1 = new Main();
      LinkList head = null;
      n = s.nextInt();
      while(n>0)
      {
        m = s.nextInt();
        head = o1.insertEnd(m);
        n--;
      }
      x = s.nextInt();
      y = s.nextInt();
      o1.swapNodes(x, y);
      o1.traverse();
      System.out.println();
      t--;
    }
  }
}
