package sec19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex19_12 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        BufferedInputStream bin = null;
        BufferedOutputStream bout = null;

        try {
            in = new FileInputStream("java/src/sec19/cat.jpg");
            out = new FileOutputStream("java/src/sec19/cat_new.jpg");
            bin = new BufferedInputStream(in);
            bout = new BufferedOutputStream(out);

            long start = System.currentTimeMillis();
            int read = 0;
            while ((read = bin.read()) != -1) {
                bout.write(read);
            }
            long end = System.currentTimeMillis();
            System.out.println((end - start)/1000 + "초");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bin != null) {
                    bin.close();
                }
                if (in != null) {
                    in.close();
                }
                if (bout != null) {
                    bout.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
