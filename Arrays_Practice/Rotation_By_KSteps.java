package Arrays_Practice;

public class Rotation_By_KSteps {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Rotate(arr,3);
    }
    static void Rotate(int arr[],int k){
        for (int i = 0; i < k; i++) {
            for (int j =arr.length-1; j >0; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println(arr);
    }
}
