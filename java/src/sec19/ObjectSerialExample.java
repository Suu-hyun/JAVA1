package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String myName;
    private int myAge;

    Person(String myName, int myAge) {
        this.myName = myName;
        this.myAge = myAge;
    }

    String getMyName() {
        return myName;
    }

    void setMyName(String myName) {
        this.myName = myName;
    }

    int getMyAge() {
        return myAge;
    }

    void setMyAge(int myAge) {
        this.myAge = myAge;
    }
}

public class ObjectSerialExample {
    public static void main(String[] args) {
        Person p1 = new Person("김일남", 99);
        Person p2 = new Person("김일남", 98);

        FileOutputStream out = null;
        ObjectOutputStream oos = null; // 직렬화

        try {
            out = new FileOutputStream("java/src/sec19/object_data.dat");
            oos = new ObjectOutputStream(out);

            oos.writeObject(p1);
            oos.writeObject(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
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
