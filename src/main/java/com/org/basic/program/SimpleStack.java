package com.org.basic.program;

/**
 * Created by SMALA on 10/17/2015.
 */
public class SimpleStack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public long[] allElements(){
        return stackArray;
    }

    public static void main(String[] args) {
        SimpleStack theStack = new SimpleStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");

        long[] longs = theStack.allElements();
        for (long aLong : longs) {
            System.out.println(aLong);
        }

    }
}
