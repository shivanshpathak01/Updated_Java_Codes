package BackTracking;

public class Q5 {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        Allpath("",board,0,0);

    }
    static void Allpath(String p,boolean [][] maze , int r , int c){
        if (r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if (r < maze.length-1){
            Allpath(p+'D',maze,r+1,c);
        }
        if (c< maze[0].length-1){
            Allpath(p+'R',maze,r,c+1);
        }
        if (r> 0){
            Allpath(p+'U',maze,r-1,c);
        }
        if (c> 0){
            Allpath(p+'L',maze,r,c-1);
        }
        //The line where function gets over
        //So befpre the function gets removed, also remove the changes that were made by the function
        maze[r][c]=true;
    }
}
