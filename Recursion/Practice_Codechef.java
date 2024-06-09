package Recursion;

//Ques -->> We have to print all the numbers from 1 to N in lexicographic order-->>>
public class Practice_Codechef {
    public static void main(String[] args) {
            PrintLexo(0,13);
    }
    static void PrintLexo(int x,int n){
        if (x>n) return;
        if (x==n){
            System.out.println(x);
            return;
        }
        if (x!=0){
            System.out.println(x);
        }
        for (int i=(x==0) ? 1:0;i<=9;i++){
            PrintLexo(10*x+i,n);
        }
    }
}
