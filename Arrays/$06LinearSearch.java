package Arrays;
public class $06LinearSearch {
    public static void main(String[] args) {
        int [] hello = {2,551,55,2,4,5,25,1,52};
        int target = 551;
        int ans  = LinearSearch2(hello,target);
        System.out.println(ans);


    }

    static int LinearSearch(int []arr,int target) {
        if (arr.length ==0){
            return -15;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        } return -10;
    }

    // IF WE HAVE TO PRINT THE ELEMENT INSTEAD OF PRINTING THE ARRAY
static int LinearSearch2(int []arr,int target) {
    if (arr.length ==0){
        return -15;
    }
    for (int index = 0; index < arr.length; index++) {
        int element = arr[index];
        if (element == target) {
            return element;
        }
    } return -10;
}

}