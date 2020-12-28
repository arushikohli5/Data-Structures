import java.util.Stack;
class infixtopostfix{
   public static void main(String argr[])
   {
       String exp="a+b*(c^d-e)^(f+g*h)-i";
       System.out.println(infexto(exp));
   }
static int priority(char c)
{
    if(c=='+'||c=='-')
    {
        return 1;
    }
    else if(c=='*'||c=='/')
    {
        return 2;
    }
    else if(c=='^')
    {
        return 3;
    }
    return -1;
}
   static String infexto(String exp)
    {
        String result=new String("");
        Stack <Character> stack=new Stack<>();
        int i=0;
        char c;
        for(i=0;i<exp.length();i++)
        {
            c=exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                result=result+c;
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    result=result+stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&priority(c)<=priority(stack.peek()))
                {
                    result=result+stack.pop();
                }
                stack.push(c);
                }
            }
        for(i=0;i<=stack.size();i++)
        {
            result=result+stack.pop();
        }
        return result;
    }

    
}