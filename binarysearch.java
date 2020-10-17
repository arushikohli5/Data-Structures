import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the no. to find");
        int x=s.nextInt();
        int lb=0,ub=n-1,mid=(n-1)/2,l=0;
        for(i=0;i<n;i++)
        {
            if(x>a[mid])
            {
                lb=mid;
                ub=n-1;
                mid=(ub+lb)/2;
            }
            else if(x<a[mid])
            {
                lb=0;
                ub=mid;
                mid=(ub+lb)/2;
            }
            else if(x==a[mid])
            {
                l=mid;
                break;
            }
        }
        System.out.println(x+" was found at "+l+" location");
        s.close();
    }
}