package Practice;

public class Rec {
    public static void main(String[] args) {
        hi(5);
    }
    static void hi(int n){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        hi(n+1);
    }
} 

