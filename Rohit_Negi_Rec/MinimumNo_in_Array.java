package Rohit_Negi_Rec;

public class MinimumNo_in_Array {
    /* Basically traversing and comparing each index values with recursive calls*/
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,6};
        System.out.println(MinNumber(arr,0));
    }
    static int MinNumber(int arr[],int index){
        if (index== arr.length-1){
            return arr[index];
        }
        return Math.min(arr[index],MinNumber(arr,index+1));
    }
}
