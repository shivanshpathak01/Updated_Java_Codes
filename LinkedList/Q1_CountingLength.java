package LinkedList;


public class Q1_CountingLength {
    public static void main(String[] args) {
        Node a = new Node(5);      // Creation of new Node   HEAD NODE
        Node b = new Node(3);       // Here if the argument is empty, then the constructor is called default Constructor
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(length(a));
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int mydata){
            data = mydata;
        }
    }
}
