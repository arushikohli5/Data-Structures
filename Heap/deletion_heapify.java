package heap;

public class deletion_heapify {
    static int heapSize=-1;
    static int heap[]=new int [500];
    public static void main(String args[]){
        Insert_min(10);
        Insert_min(40);
        Insert_min(15);
        Insert_min(30);
        Insert_min(25);
        Insert_min(35);
        System.out.println("Min Heap-:");
        for(int i=0;i<6;i++){
            System.out.println(heap[i]);
        }
        Delete();
        System.out.println("new heap:");
        for(int i=0;i<5;i++){
            System.out.println(heap[i]);
        }
    }

    static void Insert_min(int element){
        heapSize++;
        heap[heapSize]=element;
        int now =heapSize;
        while(heap[(now-1)/2]>element)
        {
            heap[now]=heap[(now-1)/2];
            now=(now-1)/2;
        }
        heap[now]=element;
    }

    static void Delete(){
        int last=heap[5];
        heap[0]=last;
        heapSize--;
        heapify(heap,0);
    }

    static void heapify(int arr[], int i) 
    { 
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
        int n=heapSize;

        if (l < n && arr[l] < arr[largest]) 
            largest = l; 
  
        
        if (r < n && arr[r] < arr[largest]) 
            largest = r; 
  
         
        if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
   
            heapify(arr,largest); 
        } 
    } 
}


