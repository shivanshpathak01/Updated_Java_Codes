package LinkedList;

import org.w3c.dom.*;

public class Basics {
    public static class Node {
        int data; //value
        Node next;   //Address of next node

        Node(int myData) {

            data = myData;
        }
    }
    static void PrintLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Printing the linkedList using Recursion -->>
    static void PrintR(Node head){
        if (head == null) return;
        System.out.print(head.data + " ");
        PrintR(head.next);
    }
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

            // If we have been given only a and we have to print all other nodes --->>
//        System.out.println(a.data);      // the value of a
//        System.out.println(a.next.data);      // the value of b
//        System.out.println(a.next.next.data);      // the value of c
//        System.out.println(a.next.next.next.data);      // the value of d
//        System.out.println(a.next.next.next.next.data);      // the value of e

        // To print the linkedList through loop we can do the following task :

//        Node temp = a;
//        for (int i = 0; i < 5; i++) {       // As there are only 5 elements
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }

        // If we do not know the size of linkedList then use While loop

//        while(temp!=null){
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }

        // Printing the LinkedList using function   -->>
//        PrintLL(a);
         PrintR(a);
    }
}
