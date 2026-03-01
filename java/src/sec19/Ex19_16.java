package sec19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex19_16 {
    public static void main(String[] args) {
         int read = 0;
        
        InputStream in = null;
        InputStreamReader inr = null;
        
        try {
            in = new FileInputStream("java/src/sec19/my_file_korean.txt");
            inr = new InputStreamReader(in, "UTF-8");

            while(true) {
                read = inr.read();

                if (read == -1) {
                    break;
                }

                System.out.print((char)read);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
