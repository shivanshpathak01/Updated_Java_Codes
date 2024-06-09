package Java_CollectionFramework;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(55);
        st.pop();
        System.out.println(st.peek());
    }
}
