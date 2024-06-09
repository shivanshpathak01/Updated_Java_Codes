package Hashing_TUF;

import java.util.Scanner;

public class Counting_Elements_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Pre compute
        int hash[] = new int[13];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            hash[arr[i]] +=1;
        }


        int q = sc.nextInt();
        while (q>0){
            int number = sc.nextInt();
            //fetching
            System.out.println(hash[number]);
        }
    }
}
