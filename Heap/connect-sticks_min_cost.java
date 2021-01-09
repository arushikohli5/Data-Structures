import java.util.Scanner;
class Result
{
  static int[] heap=new int [100];
  static int size=-1;
  static int connectCost(int lengths[], int n)
  {
	for(int i=0;i<n;i++){
      insertHeap(lengths[i]);
    }
    int sum1=0,sum=delHeap()+delHeap();
    sum1=sum;
    for(int i=0;i<n-2;i++){
      sum +=delHeap();
      sum1 +=sum;
    }
    return sum1;
  }
  
  static void insertHeap(int val){
    heap[++size]=val;
    int now=size;
    while(now!=0&&heap[(now-1)/2]>val){
      heap[now]=heap[(now-1)/2];
      now=(now-1)/2;
    }
    heap[now]=val;
  }
  
  static int delHeap(){
    int last=heap[size--];
    int val=heap[0],now,child;
    
    for(now=0;now*2<size;now=child){
      child=now*2+1;
      if(child<size&&heap[child]>heap[child+1]){
        child++;
      }
      
      if(last>heap[child]){
        heap[now]=heap[child];
      }
         
      else{
        break;
      }
    }
    heap[now]=last;
    return val;
  }
}
class connect-sticks_min_cost
{
  public static void main(String[] args)
  {
    int t, n, i, k;
    Scanner s=new Scanner(System.in);
    t=s.nextInt();
    while(t != 0)
    {
      n=s.nextInt();
      int[] a=new int[n];
      for(i=0;i<n;i++)
        a[i] = s.nextInt();
      System.out.println(Result.connectCost(a, n));
      t--;
    }
  }
}
