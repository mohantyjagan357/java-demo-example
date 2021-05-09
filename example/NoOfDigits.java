package example;

import static java.lang.Math.*;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = -5212145;
        int count = 0;

        if (n<0)
            n *= -1;

        while (n>0){
            count++;
            n /= 10;
        }
        System.out.println(count);
        //System.out.println(floor(log10(n)+1));
    }
}
