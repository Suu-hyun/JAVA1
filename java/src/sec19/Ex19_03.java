package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex19_03 {
    public static void main(String[] args) {
        OutputStream out = null;

        try {
            // out = new FileOutputStream("java/src/sec19/write.txt"); // 기본값은 false
            out = new FileOutputStream("java/src/sec19/write.txt", true); // true는 기존 파일에 이어 쓰기
            // System.out.println(out);

            out.write('h');
            out.write('e');
            out.write('l');
            out.write('l');
            out.write('o');
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
