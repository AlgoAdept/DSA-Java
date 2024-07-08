// Time Complexity : O(n)
// Space Complexity : O(1)
package RECURRANCE.src;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;



public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Binary Number : ");
        String bin;
        bin = sc.nextLine();

        int dec = 0;
        int Bin = parseInt(bin);
        if(Bin != 0){
            for (int i = 0;i < bin.length();i += 1){
                int rem = Bin % 10;
                dec = (int) (dec + rem * pow(2,i));
                Bin /= 10;
            }
        }
        System.out.println("Decimal Number Is : "+dec);
    }
}
