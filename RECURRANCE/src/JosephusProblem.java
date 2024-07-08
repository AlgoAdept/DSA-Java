package RECURRANCE.src;

import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Players and Value Of K : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int Winner = josephus(n,k);
        System.out.println("Winner Is Player Number : "+Winner);
    }
    static int josephus(int n,int k){
        if(n == 1)
            return 1;
        return (josephus(n-1,k) + k) % n;
    }
}
