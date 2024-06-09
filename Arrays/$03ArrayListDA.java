package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class $03ArrayListDA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(654);
//
//        System.out.println(list);
//        list.set(0,100);
//        System.out.println(list);
//
        // taking input in 2D array---->>>>>
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
        for (int i=0;i<5;i++){
            list.add(new ArrayList<>());
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

        ArrayList l = new ArrayList();
        l.add("hi");
        l.remove("hi");
        l.get(0);
        System.out.println(l);
    }
}
