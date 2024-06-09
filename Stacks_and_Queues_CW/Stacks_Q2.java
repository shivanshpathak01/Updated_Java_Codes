package Stacks_and_Queues_CW;

import java.util.Scanner;
import java.util.Stack;

public class Stacks_Q2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
        System.out.println(st);
    }
    private static void display(Stack<Integer> rt){
        if (rt.size()==1) return;
        int top = rt.pop();
        display(rt);
        pushAtBottom(top,rt);
    }
    private static void pushAtBottom(int top,Stack<Integer> first){
        Stack<Integer> second = new Stack<>();
        while(first.size()>0){
            second.push(first.pop());
        }
        first.push(top);
        while(second.size()>0){
            first.push(second.pop());
        }
    }
}
