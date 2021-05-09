package example;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main (String [] args) throws IOException {
        FileReader nd = new FileReader("C:\\Users\\mohan\\Desktop\\pics\\jaggy.txt");

        int c;
        while ((c = nd.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
