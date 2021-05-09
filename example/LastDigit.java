package example;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        if (n<0)
            n = -1*n;

        System.out.println(n%10);
    }
}
