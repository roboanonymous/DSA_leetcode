package Heap;

import java.util.Arrays;

public class MaxHeap {

    int[] Heap;
     int size;
     int maxsize;



    public MaxHeap(int maxsize)
    {
        // This keyword refers to current instance itself
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    public void insert(int val)
    {
        Heap[size] = val;
        int i = size;
        while (Heap[i/2] < Heap[i])
        {
            int temp =  Heap[i/2];
            Heap[i/2] = Heap[i];
            Heap[i] = temp;
            i = i/2;
        }
        size++;
    }

    public void delete()
    {
        Heap[0] = Heap[size-1];
        Heap[size-1] = 0;
        size--;
        int i=0;
        System.out.println(size);
        while(i< size-1)
        {
            int left = Heap[2*i+1];
            int right= Heap[2*i+2];

            int large = (left > right) ? 2*i+1 : 2*i+2;
            System.out.println(large);

            if(Heap[i] < Heap[large])
            {
                int temp = Heap[large];
                Heap[large] = Heap[i];
                Heap[i]  = temp;
                i=large;

            }
            else
            {
                return;
            }
        }
    }



    public static void main (String[] args)
    {
        System.out.println("Max Heap");
        MaxHeap h = new MaxHeap(10);
        System.out.println(h.maxsize);
        System.out.println(h.size);
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(40);
        h.insert(50);
        h.insert(60);
        h.insert(70);
        h.insert(80);
        h.insert(90);
        h.insert(100);
     //   h.delete();



        System.out.println(Arrays.toString(h.Heap));
        System.out.println(h.size);

    }
}
