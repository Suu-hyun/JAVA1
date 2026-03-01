package sec19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputSerialExample {
    public static void main(String[] args) {
        FileInputStream in = null;
        ObjectInputStream ois = null;

        try {
            in = new FileInputStream("java/src/sec19/object_data.dat");
            ois = new ObjectInputStream(in); // 역직렬화

            while (in.available() != 0) {
                Person p = (Person) ois.readObject();
                System.out.println("이름: " + p.getMyName() + ", 나이: " + p.getMyAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (in != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
