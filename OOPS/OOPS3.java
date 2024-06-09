package OOPS;

public class OOPS3 {
    double l ;
    double h;
    double w;


     OOPS3() {
         this.l = -1;
         this.h = -1;
         this.w = -1;
    }

    // Cube
     OOPS3(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public OOPS3(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    OOPS3 (OOPS3 old){
         this.h = old.h;
         this.l = old.l;
         this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
