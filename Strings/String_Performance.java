package Strings;

public class String_Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <26 ; i++) {
            char ab = (char)('a' + i);
            series+= ab;
        }
        System.out.println(series);
    }
}
