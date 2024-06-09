package Arrays;

public class $12LeetcodeQues2 {
    public static void main(String[] args) {
      int [][] arr = {{5,6,8},{5,75,1,6},{5,2,3,56,645}};
        System.out.println(arr);
    }
    public int maxWealth(int[][]accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person <accounts.length ; person++) {
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum+accounts[person][account];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
