package Practice;

public class GFG_Fraction_comparison_Problem {
    public static void main(String[] args) {
        String str = "5/6, 11/45";
        String[] nums = str.split(",");
        String num1 =nums[0].trim();
        String num2 =nums[1].trim();
        String[] num1ND = num1.split("/");
        String num1N = num1ND[0].trim();
        String num1D = num1ND[1].trim();
        String[] num2ND = num2.split("/");
        String num2N = num2ND[0].trim();
        String num2D = num2ND[1].trim();
        double n1 = Double.parseDouble(num1N)/Double.parseDouble(num1D);
        double n2 = Double.parseDouble(num2N)/Double.parseDouble(num2D);
        System.out.println(n1);
        System.out.println(n2);
//        int n1 = Integer.parseInt(num1N)*Integer.parseInt(num2D);
//        int n2 = Integer.parseInt(num2N)*Integer.parseInt(num1D);

        // Above mentioned both the methods are correct, You can use any of the above

        if(n1==n2){
            System.out.println("equal");
        }else if(n1>n2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}