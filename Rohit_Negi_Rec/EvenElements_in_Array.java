package Rohit_Negi_Rec;
//   **************************        IMPORTANT            **********************

// Ques - Find the Number of even elements in a given array of size N.

public class EvenElements_in_Array {
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,6};
        System.out.println(Even(arr,0, arr.length-1));
    }
    static int Even(int arr[],int start,int end){
        if (start > end) {
            return 0;
        }
        int count =0;
        int CurrentElement = arr[start];
        int EvenCount = (CurrentElement % 2==0)?1:0;
        int Remaining = Even(arr,start+1,end);
        return EvenCount + Remaining;
    }
}
