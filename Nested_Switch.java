import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        String Career = in.next();
        switch (money) {
            case 1 -> System.out.println("shivansh Pathak");
            case 2 -> {
                System.out.println("Mohit Pathak");
            }
            case 3 -> {
                switch (Career) {
                    case "engineering" -> System.out.println("IIT");
                    case "Doctor" -> System.out.println("AIIMS");
                    case "commerce" -> System.out.println("CA");
                }
            }
        }
    }
}