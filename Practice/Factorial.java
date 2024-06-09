package Practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
    static long Fact(int a){
        long x =1;
        for (int i = 1; i <= a; i++) {
            a=a*i;
        }
        return a;
    }
}
