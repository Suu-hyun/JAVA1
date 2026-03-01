package sec19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_01 {
    public static void main(String[] args) {

        int read = 0;
        
        InputStream in = null;
        
        try {
            in = new FileInputStream("java/src/sec19/my_file.txt");

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
