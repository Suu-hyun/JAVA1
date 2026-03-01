package sec19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19_08 {
    public static void main(String[] args) {
         int read = 0;
        
        Reader in = null;
        
        try {
            in = new FileReader("java/src/sec19/my_file_korean.txt");

            while(true) {
                read = in.read();

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
