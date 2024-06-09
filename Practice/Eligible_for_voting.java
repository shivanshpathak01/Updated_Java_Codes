package Practice;

public class Eligible_for_voting {
    public static void main(String[] args) {
        System.out.println(eligibility(50));
    }
    static int eligibility(int a){
        if (a>=18){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        return 0;
    }
}
