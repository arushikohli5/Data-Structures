import java.util.Stack;
public class infixtoprefix {
    public static void main(String args[])
    {
        String exp1="(A - B/C) * (A/K-L)";
        System.out.println(convert(exp1));
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
    static StringBuilder convert(String exp1)
    {
        StringBuilder result=new StringBuilder();
        StringBuilder exp=new StringBuilder(exp1);
        Stack<Character> stack=new Stack<>();
        exp.reverse();
        char [] c1 = new String(exp).toCharArray();
        for(int i=0;i<exp.length();i++)
        {
            if(c1[i]=='(')
            {
                c1[i]=')';
            }
            else if(c1[i]==')')
            {
                c1[i]='(';
            }
        }
        for(int i=0;i<exp.length();i++)
        {
           char c=c1[i];
           if(priority(c)>0)
           {
                while(!stack.isEmpty() && priority(stack.peek())>=priority(c))
                {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
            else if(c==')')
            {
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else
            {
                result.append(c);
            }
        }
        
        for(int i=0;i<=stack.size();i++)
        {
            result.append(stack.pop());
        }
        return result.reverse();
    }
}