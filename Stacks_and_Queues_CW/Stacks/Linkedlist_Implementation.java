package Stacks_and_Queues_CW.Stacks;

public class Linkedlist_Implementation {
    public static class Node{
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if (head==null){
                System.out.println("Stack is empty");
                return -50;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if (head==null){
                System.out.println("Stack is empty");
                return -50;
            }
            return head.val;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(5);
        st.push(25);
        st.display();
        System.out.println(st.peek());
        st.display();
    }
}
