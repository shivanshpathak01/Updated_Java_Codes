package LL_by_TUF;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
    this.data = data1;
    this.next = next1;
    }
    Node (int data1){
        this.data = data1;
        this.next = null;
    }
}
public class Singly_LL {
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    private static Node ArraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    /*******                        DELETION                           *******/
    private static Node deleteHead(Node head){
        if (head ==null) return head;
        head = head.next;
        return head;
    }
    private static Node deleteTail(Node head){
        if (head == null || head.next==null) return null;
        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private static Node removeK(Node head,int k){
        if (head==null) return head;
        if (k==1){
            Node temp = head;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            count++;
            if (count==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removebyValue(Node head,int ele){
        if (head==null) return head;
        if (head.data==ele){
            Node temp = head;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if (temp.data == ele){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    /************                  INSERTION              ***********/
    private static Node insertAtHead(Node head,int val){
        Node temp = new Node(val,head);           // takes the value and takes what is the next
            return temp;
        }

        private static Node insertAtEnd(Node head,int val){
        if (head == null) return new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    private static Node insertAtPosition(Node head,int k,int ele){
        if (head == null) {
            if (k==1) return new Node(ele);
        }
        else {return head;}
        if (k==1){
            return new Node(ele,head);
        }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            if (count == (k - 1)){
                Node x = new Node(ele,temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {12,5,4,5,1};
        Node head = ArraytoLL(arr);
        head = insertAtPosition(head,100,1);
        print(head);
    }
}
