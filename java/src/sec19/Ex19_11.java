package sec19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_11 {
    public static void main(String[] args) {

        int read = 0;
        
        InputStream in = null;
        BufferedInputStream bin = null;

        try {
            in = new FileInputStream("java/src/sec19/my_file.txt");
            bin = new BufferedInputStream(in);

            while(true) {
                read = bin.read();

                if (read == -1) {
                    break;
                }

                System.out.print((char)read);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bin != null) {
                    bin.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
