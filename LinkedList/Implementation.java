package LinkedList;

// we are going to make the linkedlist and some of its functions -->>>

import java.util.LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int mydata){
            data = mydata;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail  = null;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) head = temp;
            else {
                tail.next = temp;
            }
            tail = temp;
        }
             void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }

      public static void main(String[] args) {
          linkedlist ll = new linkedlist();
          ll.insertAtEnd(4);
          ll.insertAtEnd(5);
          ll.display();
      }
}
