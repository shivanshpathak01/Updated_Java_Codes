package Rohit_Negi_Rec;

public class CountVowels_IN_Strings {
    public static void main(String[] args) {
        String str = " ";
        String l = str.toLowerCase();
        System.out.println(Count(l,l.length()-1));
    }
    static int Count(String str, int index){
        if (index ==-1){
            return 0;
        }
        if (str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u'){
            return 1+Count(str,index-1);
        }
        else{
            return Count(str,index-1);
        }
    }
}
