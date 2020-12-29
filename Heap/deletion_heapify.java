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
        heapify(0);
    }

    static void heapify(int i){
        int least=i;
        int n=heapSize;
        int l=least*2+1;
        int r=least*2+2;
        if(l<n&&heap[l]<heap[least]);
        {
            least=l;
        }

        if(r<n&&heap[r]<heap[least]);
        {
            least=r;
        }

        if(least!=i){
            int temp=heap[i];
            heap[i]=heap[least];
            heap[least]=temp;
        }

        heapify(least);
    }
}


