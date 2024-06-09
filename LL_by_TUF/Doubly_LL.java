package LL_by_TUF;

public class Doubly_LL {
    static class Node{
        int data;
        Node next;
        Node back;
        Node(int data1, Node next1,Node back1){
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }
        Node (int data1){
            this.data = data1;
            this.next = null;
            this.back = null;
        }
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    private static Node ArraytoDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;   // connection to prev of this newly created temp
            prev = temp;   //prev now shifted to this newly created temp (Note : Also we can write it as prev = prev.next)
        }
        return head;
    }
    /************        Deletion in Doubly LinkedList        *************/
    private static Node deleteHead(Node head){
        if (head==null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    private static Node deleteTail(Node head){
        if (head==null || head.next == null) return null;
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;
    }

        private static Node deleteKthELement(Node head,int k){
        Node temp = head;
        int count =0;
        while(temp!=null){
            count++;
            if (count==k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if (prev == null && front==null) return null;
        else if (prev == null) {
            return deleteHead(head);
        }
        else if(front==null) {
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;
        return head;
    }
    private static void deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;
        if (front==null){
            prev.next=null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
    }

    /*****************               Insertion in DLL                  **************/
    private static Node InsertAtHead(Node head,int value){
        Node newhead = new Node(value,head,null);
        head.back = newhead;
        return newhead;
    }

    public static void main(String[] args) {
        int arr[] = {12,5,4,5,1};
        Node head = ArraytoDLL(arr);
        head = InsertAtHead(head,25);
        print(head);
    }
}
