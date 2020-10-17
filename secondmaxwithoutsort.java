import java.util.Scanner;
public class secondmaxwithoutsort {
    public static void main(String[] args)
    {
        // Write your code here
      int []a=new int [5];
     	Scanner s=new Scanner(System.in);
      int i;
      for(i=0;i<5;i++)
      {
        a[i]=s.nextInt();
      }
      int max=a[0];
      int sec=0;
      for(i=0;i<5;i++)
      {
        if(a[i]>max)
        {
          sec=max;
          max=a[i];
        }
        else if (a[i] > sec&&a[i]<max) 
        {
				sec = a[i];
     	 }
      }
      System.out.println(sec);
   s.close();
    }
}