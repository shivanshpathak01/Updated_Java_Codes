package Practice;

/* Basically ham ek last index manenge jaha value zero manenge, Aur BASE CASE me jab value of index
becomes equal to that number RETURN 0 kara denge because already zero given hai uski value Aur phir
ham baaki bachi hui values ko usi me ADD kar karke nikal lenge */

public class Sum_Of_ArrayElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Array(arr,0, arr.length));
    }
    static int Array(int []arr,int index,int n){ // n is basically arr.length {Length of the ARRAY}-->>>
        if(n==index){
            return 0;
        }
        return arr[index] + Array(arr,index+1,n);
    }
}