package Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ab = (char)('a' + i);
           builder.append(ab);
        }
        System.out.println(builder.toString());
        // Check many functions as much as you can by putting a . >>>>
        builder.reverse();
    }
}
