package heap;
import java.util.*;
public class check_max {
    static int isMaxHeap(int array[], int n)
    {
        for(int i=0;i<n/2;i++){
            int left=2*i+1;
            int right=2*i+2;
            if((left<n&&array[i]<array[left])||(right<n&&array[i]<array[right])){
            return 0;
            }
        }
    return 1;
    }
public static void main(String[] args)
 {
  int t, n, i;
  Scanner s=new Scanner(System.in);
  t=s.nextInt();
  while(t != 0)
  {
    n=s.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    System.out.println(isMaxHeap(a, n));
    t--;
  }
  s.close();
 }
}

