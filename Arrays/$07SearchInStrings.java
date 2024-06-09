package Arrays;

public class $07SearchInStrings {
    public static void main(String[] args) {
        String a = "shivansh";
        char target = 'p';
        System.out.println(search(a,target));
    }
    static boolean search(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
