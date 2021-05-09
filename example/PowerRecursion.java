package example;

import java.util.Scanner;

public class PowerRecursion {
    static  int power(int a , int n){
        if (n == 0){
            return 1;
        }
        return a * power(a, n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:- ");
        int a = sc.nextInt();
        System.out.println("Enter the power:- ");
        int n = sc.nextInt();
        System.out.println(power(a,n));
    }
}
