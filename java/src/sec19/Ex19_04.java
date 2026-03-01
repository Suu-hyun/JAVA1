package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// import java.util.Arrays;

public class Ex19_04 {
    public static void main(String[] args) {
        OutputStream out = null;

        try {
            out = new FileOutputStream("java/src/sec19/write.txt");
            String str = "hello java";
            byte[] strArr = str.getBytes();
            // System.out.println(Arrays.toString(strArr));

            out.write(strArr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
