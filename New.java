import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String colour = in.next();

        switch (colour) {
            case "red" -> System.out.println("Dark colour");
            case "white" -> System.out.println("white marbles are my favorite");
            case "blue" -> System.out.println("already following men in blue");
            case "black" -> System.out.println("my all time favorite colour ");
            default -> System.out.println("please enter the correct choice");
        }
    }// enhanced switch can be done by alt+enter----->>>>
    
}
