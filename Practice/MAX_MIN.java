package Practice;

public class MAX_MIN {
    public static void main(String[] args) {
        System.out.println(max(45,20,30));
    }
        static int max (int a,int b,int c){
            if (a>b && a>c){
                return a;
            } else if (b>a && b>c) {
                return b;
            }else {
                return c;
            }
        }
        static int min(int a, int b, int c){
            if (a<b && a<c){
                return a;
            } else if (b<a && b<c) {
                return b;
            }else {
                return c;
            }
        }
    }