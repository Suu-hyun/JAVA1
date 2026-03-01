package sec19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19_14 {
    public static void main(String[] args) {
        Reader in = null;
        BufferedReader bin = null;
        
        try {
            in = new FileReader("java/src/sec19/my_file_korean.txt");
            bin = new BufferedReader(in);

            String str = "";
            
            // 줄 단위로 읽어 오기
            while((str = bin.readLine()) != null) {
                System.out.println(str);
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
