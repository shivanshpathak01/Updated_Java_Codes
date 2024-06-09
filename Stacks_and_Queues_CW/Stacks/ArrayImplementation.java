package Stacks_and_Queues_CW.Stacks;


public class ArrayImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        System.out.println(st.peek());

    }
    public static class Stack{
        int arr[] = new int[100];
        int idx = 0;
        void push(int x){
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if (idx==0){
                System.out.println("Stack is empty");
                return -151;
            }
            return arr[idx-1];
        }
        int pop(){
            if (idx==0){
                System.out.println("Stack is empty");
                return -15;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;   // Replacing the value with 0, bcz in array by default it's value is 0.
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
