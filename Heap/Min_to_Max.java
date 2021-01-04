package heap;
import java.util.Scanner;
public class Min_to_Max{
static void modifyMintoMax(int a[], int n)
{
for(int i=n;i>=0;i--){
  heapify(a,i,n);
}
}
static void heapify(int heap[],int i,int n){
  int largest=i,
  left=2*i+1,
  right=2*i+2;
  if(left<n&&heap[left]>heap[largest]){
    largest=left;
  }
  if(right<n&&heap[right]>heap[largest]){
   largest=right;
  }
  if(largest!=i)
  {
    int tmp=heap[largest];
    heap[largest]=heap[i];
    heap[i]=tmp;
    heapify(heap,largest,n);
  }
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
    modifyMintoMax(a,n);
    for(i=0;i<n;i++)
      System.out.print(a[i] + " ");
    System.out.println();
    t--;
  }
 }
}
