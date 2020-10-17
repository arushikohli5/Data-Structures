import java.util.*;
public class optimizedbubblesort {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int [n];
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
    for(i=0;i<n;i++)
    {
        int flag=0;
        for( j=0;j<n-1;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }
        }
        if(flag==0)
        {
            break;
        }
    }
    for(i=0;i<n;i++)
        {
           System.out.println(a[i]);
        }
    s.close();
}
}
