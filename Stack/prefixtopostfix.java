import java.util.Stack;
public class prefixtopostfix {
    public static void main(String args[])
    {
        String exp="*-A/BC-/AKL";
        System.out.println(convert(exp));
    }
    static String convert(String exp)
    {
        Stack<String> stack=new Stack<>();
        char c;
        for(int i=exp.length()-1;i>=0;i--)
        {
            c=exp.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
            {
                String a=stack.pop();
                String b=stack.pop();
                String result=a+b+c;
                stack.push(result);
            }
            else
            {
                stack.push(c+"");
            }
        }
        return stack.peek();
    }
}