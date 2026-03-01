package sec19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex19_06 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("java/src/sec19/cat.jpg");
            out = new FileOutputStream("java/src/sec19/cat_new.jpg");
            byte[] buffer = new byte[10000];

            long start = System.currentTimeMillis();
            int read = 0;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            long end = System.currentTimeMillis();
            System.out.println((end - start)/1000 + "초");
        } catch (IOException e) {
            e.printStackTrace();
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
