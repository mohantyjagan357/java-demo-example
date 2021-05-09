package example;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonArarylist {
    public static void main (String [] args) {
        int a [] = {69, 69, 69, 45, 15, 15, 15, 45, 96};
        ArrayList <Integer> ab = new ArrayList <Integer> ();
        for (int i = 0; i<a.length; i++) {
            int k = 0;
            if(!ab.contains(a[i])) {
                ab.add(a[i]);
                k++;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }

                //System.out.print(a[i] + "-");
                //System.out.print(k + " ");
                if (k==1)
                System.out.println(a[i] + " is my unique number.");
            }
        }
    }
}
