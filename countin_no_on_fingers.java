import java.util.*;
public class countin_no_on_fingers{
public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the no.");
    n=s.nextInt();
   System.out.println("The no. will be at "+find(n)+" finger");
    s.close();
}
static int find(int n){
    int r=n%8;
    if(r==1)
    {
        return 1;
    }
    else if(r==2||r==0)
    {
        return 2;
    }
    else if(r==3||r==7)
    return 3;

    else if(r==4||r==6)
    return 4;

    else
    return 5;
}
}