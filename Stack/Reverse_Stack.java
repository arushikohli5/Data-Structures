import java.util.*;

class Reverse_Stack
{
  public int maxSize; 
  public int[] stackArray;
  public int top; 

  public CQStack(int s) 
  {
    maxSize = s; 
    stackArray = new int[maxSize]; 
    top = -1; 
  }
  public void push(int j) 
  {
    if(isFull())
    {
      return;
    }
    else
    {
      stackArray[++top] = j; 
    }
  }
  public int pop() 
  {
    if (isEmpty())
    {
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      return temp; 
    }
  }
  public boolean isEmpty() 
  {
    return (top == -1);
  }
  public boolean isFull() 
  {
    return (top == maxSize-1);
  }
}

class Main
{
static String reverseString(CQStack s, String st)
{
  String a=new String();
	for(int i=0;i<st.length();i++)
    {
      s.push(st.charAt(i));
    }
  while(!s.isEmpty())
  {
    a=a+(char)s.pop();
  }
  return a;
}
public static void main(String[] args)
  {
    Reverse_Stack theStack = new Reverse_Stack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    String st;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      theStack.top = -1;
      n= Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        st = s.nextLine().trim();
        st = reverseString(theStack, st);
        System.out.println(st);
        n--;
      }
      System.out.print("\n");
      t--;
    }
  }
}
