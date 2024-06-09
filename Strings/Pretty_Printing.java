package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Pretty_Printing {
    public static void main(String[] args) {
        float a = 54.2585f;
        System.out.printf("%.3f\n",a);
        System.out.printf("Pie %.8f\n",Math.PI);
        System.out.printf("Hello i am %s and I have %s","Shivansh", "BMW");
        System.out.println();
        System.out.println(new ArrayList<>() + "Shivansh");
//        System.out.println( new Integer() + new ArrayList<>());  >>>>----   '+' Can only added between either
//        primitives or if it is complex then there should be a string present between
        System.out.println( new Integer(20) + "" + new ArrayList<>());  // Now this is correct...
    }
}
