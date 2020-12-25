import java.util.*;

class stack_using_array
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    stackArray=new int[s];
    maxSize=s;
    top=-1;
  }

  public void push(int j) // put item on top of stack
  {
    if(!isFull())
    stackArray[++top]=j;
  }
  
  public int pop() // take item from top of stack
  {
    if(isEmpty())
      return -1;
    return stackArray[top--];
  }

  public boolean isEmpty() // true if stack is empty
  {
    if(top==-1)
    {
      return true;
    }
    else
      return false;
  }

  public boolean isFull() // true if stack is full
  {
    if(top==maxSize-1)
    {
      return true;
    }
    else
      return false;
  }
  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(10); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      theStack.top = -1;
      n= Integer.parseInt(s.nextLine());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine());
        if(q1 == 1){
          q2 = Integer.parseInt(s.nextLine());
          theStack.push(q2);
        }
        else
          System.out.print(theStack.pop() + " ");
        n--;
      }
      System.out.print("\n");
      t--;
    }
