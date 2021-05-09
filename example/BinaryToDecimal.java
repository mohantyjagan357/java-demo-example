package example;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary no:- ");
        int n = sc.nextInt();
        int ans = 0;
        int base = 1;

        while (n!=0){
            ans += base*(n%10);
            base *= 2;
            n /= 10;
        }
        System.out.println("The Decimal number is :- "+ans);

    }
}
