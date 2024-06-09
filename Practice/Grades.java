package Practice;

public class Grades {
    public static void main(String[] args) {
        System.out.println(Grades(75));
    }
    static int Grades(int a){
        if (a>=91 && a<=100){
            System.out.println("AA");
        } else if (a>=81 && a<=90) {
            System.out.println("AB");
        }
        else if (a>=71 && a<=80) {
            System.out.println("BB");
        }else if (a>=61 && a<=70) {
            System.out.println("BC");
        }else if (a>=51 && a<=60) {
            System.out.println("CD");
        }else if (a>=41 && a<=50) {
            System.out.println("DD");
        }else if (a<=40) {
            System.out.println("FAIL");
        }
        return 0;
    }
}
