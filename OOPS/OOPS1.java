package OOPS;

public class OOPS1 {
    public static void main(String[] args) {
        Student Shivansh = new Student();
        System.out.println(Shivansh.name);
    }
}
    class Student {
        int rollno;
        String name;
        float percentile = 90;


        //Student arpit = new Student();
        //here, this will be replaced with arpit
        Student (){     // this is how you call a constructor from another constructor --->>>>
            //    internally it is like new Student(13,"rah",93.32f);
            this(13,"rah",93.32f);
        }

        Student(int rollno,String name ,float percentile){
            this.rollno = rollno;
            this.name = String.valueOf(name);
            this.percentile = percentile;
        }
    }
