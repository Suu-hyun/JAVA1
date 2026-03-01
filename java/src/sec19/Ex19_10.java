package sec19;

import java.io.FileWriter;
import java.io.IOException;

public class Ex19_10 {
    public static void main(String[] args) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("java/src/sec19/write_korean.txt");
            writer.write('안');
            writer.write('녕');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
