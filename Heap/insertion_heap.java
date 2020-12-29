package heap;
public class insertion_heap {
    static int heapSize=-1;
    static int heap[]=new int [100];
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
        /*Insert_max(10);
        Insert_max(40);
        Insert_max(15);
        Insert_max(30);
        Insert_max(25);
        Insert_max(35);
        System.out.println("Max Heap-:");
        for(int i=0;i<6;i++){
            System.out.println(heapm[i]);
        }*/
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
}
