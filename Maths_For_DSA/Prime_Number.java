package Maths_For_DSA;

public class Prime_Number {
    public static void main(String[] args) {
       int n=10;
        for (int i = 0; i <=40; i++) {
            System.out.println(i+" " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int x=2;
        while (x*x<=n){
            if(n%x==0){
                return false;
            }
            x++;
        }
        return true;
    }
}
