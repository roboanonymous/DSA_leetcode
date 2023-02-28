package StackQueue;

public class StackArray {

    public  int stack[] = new int[1000];
    public int size = 0;

    public void push(int n)
    {
        stack[size] = n;
        size++;
    }

    public int pop()
    {
        int a = stack[size-1];
        size--;
        return a;
    }

    public int top()
    {
        return stack[size-1];
    }

    public void display()
    {
        for (int i=0; i<size; i++)
        {
            System.out.println(stack[i]+ " " + size);
        }
    }


    public static void main(String[] args)
    {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println(s.top());
        s.push(50);
        System.out.println(s.pop());
        System.out.println(s.top());
        s.display();

    }

}
