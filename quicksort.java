import java.util.*;
public class quicksort{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of elements");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.print("Enter the elements in array");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        quicksort ob=new quicksort();
        ob.qsort(a,0,n-1); 
        print(a);
    }
    static void qsort(int a[],int lb,int ub)
    {
        if(lb<ub)
        {
            int p=partition(a,lb,ub);
            qsort(a,lb,p-1);
            qsort(a,p+1,ub);
        }
        
    } 
    static int partition(int a[],int lb,int ub)
    {
        int i=lb-1;
        int pivot=a[ub];
        for(int j=lb;j<ub;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[ub];
        a[ub]=temp;
        return i+1;
    }
    static void print(int a[])
    {
        System.out.println("The array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}