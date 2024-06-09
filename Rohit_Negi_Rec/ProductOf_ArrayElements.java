package Rohit_Negi_Rec;

public class ProductOf_ArrayElements {
    public static void main(String[] args) {
        int arr[]={};
        System.out.println(Product(arr,0));
    }
    static int Product(int arr[],int index){
        if (index== arr.length)
            return 1;
        return arr[index]*Product(arr,index+1);
    }
}
