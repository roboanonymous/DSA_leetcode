package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextSmall {

    public static int[] prevSmaller(int[] A) {
        int n = A.length;
        Stack <Integer> s = new Stack<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(s.isEmpty())
            {
                ans[i]=-1;
                s.push(A[i]);
            }
            else
            {
                if(A[i]<=s.peek())
                {
                    ans[i]=-1;
                    s.push(A[i]);
                }

                else
                {
                    ans[i] = s.peek();
                }
            }

        }
        return ans;
    }

    public static void main (String[] args)
    {
       int A[] = {4, 5, 2, 10, 8};
        System.out.println("Nearest Smaller Element");
        int ans[] = prevSmaller(A);
        System.out.println(Arrays.toString(ans));
    }
}
