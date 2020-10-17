import java.util.*;
class Result {
 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int i,count=0,num=0;
   int []a=new int[n];
   for(i=0;i<n;i++)
   {
     a[i]=s.nextInt();
   }
   int min=a[0];
   
    for(i=0;i<n;i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    while(num<=n)
    {
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                num++;
            }
        }
    
        
        for(i=0;i<n;i++)
        {
             if(a[i]>=min)
            {
                a[i]=a[i]-min;
                count++;
            }
            else if(a[i]<min&&a[i]!=0)
            {
                a[i]=0;
                count++;
            }
                    
        }
        System.out.println("heyyy"+count);
        count=0;
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
        
 
        s.close();
    }
}