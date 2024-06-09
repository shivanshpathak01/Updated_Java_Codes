package Recursion2_Lvl_1_Ques;

import static Recursion2_Lvl_1_Ques.Q6.helper;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Q7 {
    public int NoofSteps(int num){
        return helper(num,0);
    }
    private int helper(int num,int steps){
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
