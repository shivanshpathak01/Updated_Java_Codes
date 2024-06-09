package Rec_Striver;

public class Re2 {
    public static void main(String[] args) {
        f(1,1);
    }
    static void f(int i,int n){
        if (i>5)return;
        f(i+1,n);
        System.out.println(i);

    }
}
