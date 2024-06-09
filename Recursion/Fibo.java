package Recursion;

public class Fibo {
    public static void main(String[] args) {
        //System.out.println(fibo(50)); // program got stuck because of memory...
        for (int i = 0; i < 15; i++) {
            fiboform(i);
        }
    }
    static int fiboform(int n){
        return (int) ((int)(Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    static int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

