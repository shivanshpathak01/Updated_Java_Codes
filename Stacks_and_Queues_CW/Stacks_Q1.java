package Stacks_and_Queues_CW;

import java.util.Stack;
// Ques- Copy the stack into another in same order
public class Stacks_Q1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> revStack = new Stack<>();
        while(st.size()>0){
            revStack.push(st.pop());
        }
        System.out.println(revStack);
        Stack<Integer> newStack = new Stack<>();
        while(revStack.size()>0){
            newStack.push(revStack.pop());
        }
        System.out.println(newStack);
    }
}
