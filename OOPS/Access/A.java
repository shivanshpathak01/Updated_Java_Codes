package OOPS.Access;

public class A {
    public void setNum(int num) { // As setNum() function is public so can be accessed from anywhere outside also.
        this.num = num;
    }

    public int getNum() { // Written public in before the method so can be accessed from anywhere outside.
        return num;
    }

    private int num;
    String name;
    int[] arr;

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
}