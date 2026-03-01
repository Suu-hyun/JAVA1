package sec19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Ex19_15 {
    public static void main(String[] args) {
        Reader in = null;
        BufferedReader bin = null;
        FileWriter w = null;
        BufferedWriter bw = null;

        try {
            in = new FileReader("java/src/sec19/my_file_korean.txt");
            bin = new BufferedReader(in);
            w = new FileWriter("java/src/sec19/my_file_korean_new.txt");
            bw = new BufferedWriter(w);

            String str = "";
            
            // 줄 단위로 읽어 오기
            while((str = bin.readLine()) != null) {
                System.out.println(str);
                bw.write(str + "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // 보조 스트림 객체를 먼저 닫고 기반 스트림 객체를 닫아야 함.
            // 이 과정이 없으면 생성된 파일에 데이터가 저장되지 않음.
            try {
                if (bin != null) {
                    bin.close();
                }
                if (in != null) {
                    in.close();
                }
                if (bw != null) {
                    bw.close();
                }
                if (w != null) {
                    w.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
