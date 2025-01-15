package Graph_TUF;

import java.util.ArrayList;

public class $01_Representation {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
//        int adj[][] = new int[n+1][n+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        // n + 1
        for (int i = 0; i < n; i++) 
            adj.add(new ArrayList<Integer>());

            // edge 1--2
            adj.get(1).add(2);
            adj.get(2).add(1);

            adj.get(1).add(3);
            adj.get(3).add(1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
