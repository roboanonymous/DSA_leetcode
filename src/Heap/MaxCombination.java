package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxCombination {

    static void KMaxCombinations(int A[], int B[],
                                 int N, int K) {
        PriorityQueue<Integer> pq
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                pq.add(A[i] + B[j]);


        int count = 0;

        while (count < K) {
            System.out.println(pq.peek());
            pq.remove();
            count++;
        }
    }


    public static void main (String[] args)
    {
        System.out.println("Max Sum Combination");

       int  A[] = {1, 4, 2, 3};
       int  B[] = {2, 5, 1, 6};
       int C = 4;
       int N = A.length;

        KMaxCombinations(A, B, N, C);



    }
}
