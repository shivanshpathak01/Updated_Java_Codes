package BackTracking;

import java.util.ArrayList;

public class Q2_Path_Print {
    public static void main(String[] args) {
        System.out.println(PrintPathRet("",3,3));
    }
    static void PrintPath(String p , int row , int col){
        if (row ==1 && col ==1){
            System.out.println(p);
        }
        if (row>1){
            PrintPath(p+'D',row-1,col);
        }
        if (col>1){
            PrintPath(p+'R',row,col-1);
        }
    }

    static ArrayList PrintPathRet(String p , int row , int col){
        if (row ==1 && col ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row>1){
            list.addAll(PrintPathRet(p+'D',row-1,col));
        }
        if (col>1){
            list.addAll(PrintPathRet(p+'R',row,col-1));
        }
        return list;
    }
}
