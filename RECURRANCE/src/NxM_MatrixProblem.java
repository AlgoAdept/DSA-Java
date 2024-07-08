package RECURRANCE.src;

import java.util.Scanner;


public class NxM_MatrixProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No Of Rows & Columns In The Matrix : ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int noOfWays = Count(rows,columns);
        System.out.println("There Are "+noOfWays+" Number Of Ways To Reach The Endpoint ");
    }
    static int Count(int n,int m){
        if(n == 1 || m == 1)
            return 1;
        return Count(n-1,m) + Count(n,m-1);
    }
}
