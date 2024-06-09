package OOPS;

public class OOPS2 {
    public static void main(String[] args) {

    }

    // Non static methods dependent upon objects
    void greeting (){

    }

    //static methods do not dependent upon objects
    static void fun(){
        //greeting();   //You can not use it here bcz it requires instances but the function we are using here doesnot
        //dependent upon instances or objects
        // You cannot access non static stuff without referencing their instances in a static context

        // So we are referencing it
        OOPS2 obj = new OOPS2();
        obj.greeting();
    }
}
