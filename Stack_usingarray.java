class Stack_usingarray {
    static final int max=1000;
    static int top=-1;
    static int stack[]=new int[max];
    static boolean isempty(){
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    static void push(int data){
        if(top>=max-1)
        {
            System.out.println("Stack overflow");
        }
        else{
            stack[++top]=data;
            System.out.println("Element sucsessfully added");
        }
    }
    static int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stack[top--];
        }
    }
    static int peak(){
        return stack[top];
    }
    static void printstack(){
        if(top<0)
        {
            System.out.println("Stack underflow");
        }
        else{
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
                System.out.println("\n");
            }
        }
    }
        public static void main(String[] args) {    
        push(10);
        push(20);
        push(30);
        pop();
        push(40);
        printstack();
    }
}