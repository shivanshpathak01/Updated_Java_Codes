package BackTracking;

import java.util.ArrayList;

public class Q3 {
    // Basically Previous question but this time just there is one more way to go i.e. We Can Go Diagonally too--->>>
    public static void main(String[] args) {
        System.out.println(PrintPathRetDia("",3,3));
    }

    static ArrayList PrintPathRetDia(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1) {
            list.addAll(PrintPathRetDia(p + 'D', row - 1, col - 1));}
            if (row > 1) {
                list.addAll(PrintPathRetDia(p + 'H', row - 1, col));
            }
            if (col > 1) {
                list.addAll(PrintPathRetDia(p + 'V', row, col - 1));
            }
            return list;
    }
}
