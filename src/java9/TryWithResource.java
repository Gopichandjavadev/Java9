package java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) throws IOException {
            
            BufferedReader reader1 = new BufferedReader(new FileReader("chandDev.txt"));
            try (reader1) {
              System.out.println(reader1.readLine());
            }
    }

}
