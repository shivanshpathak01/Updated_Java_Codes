package BackTracking;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {


    boolean [][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
    };
    int[][]path = new int[board.length][board[0].length];
    AllpathPrint("",board,0,0,path,1);

}
    static void AllpathPrint(String p,boolean [][] maze , int r , int c,int [][] path,int step){
        if (r== maze.length-1 && c== maze[0].length-1){
            path[r][c]=step;
            for (int[]arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if (r < maze.length-1){
            AllpathPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if (c< maze[0].length-1){
            AllpathPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if (r> 0){
            AllpathPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if (c> 0){
            AllpathPrint(p+'L',maze,r,c-1,path,step+1);
        }
        //The line where function gets over
        //So befpre the function gets removed, also remove the changes that were made by the function
        maze[r][c]=true;
        path[r][c]=0;
    }
}
