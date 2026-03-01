package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex19_17 {
    public static void main(String[] args) {
        OutputStream out = null;
        OutputStreamWriter outw = null;

        try {
            out = new FileOutputStream("java/src/sec19/write_kor.txt");
            outw = new OutputStreamWriter(out);

            String[] strArr = {"자바", "를 배우는 것은 ", "재밌습니다."};
            for (String str : strArr) {
                outw.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outw != null) {
                    outw.close();
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
