package sec16;

import java.util.HashSet;
import java.util.Set;

class TextMessage {
    private int msgNumber;
    private String msg;

    TextMessage(int msgNumber, String msg) {
        this.msgNumber = msgNumber;
        this.msg = msg;
    }

    int getMsgNumber() {
        return msgNumber;
    }

    String getMsg() {
        return msg;
    }

    @Override
    public int hashCode() {
        return msgNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TextMessage) {
            TextMessage compare = (TextMessage) obj;
            if (this.msg.equals(compare.getMsg())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        TextMessage msg1 = new TextMessage(1, "Hello");
        TextMessage msg2 = new TextMessage(1, "Hi");
        TextMessage msg3 = new TextMessage(1, "Hello");
        TextMessage msg4 = new TextMessage(1, "Hi, there");
        TextMessage msg5 = new TextMessage(2, "Hello");

        Set<TextMessage> msgSet = new HashSet<>();
        System.out.println(msgSet); // []

        msgSet.add(msg1);
        msgSet.add(msg2);
        msgSet.add(msg3);
        msgSet.add(msg4);
        msgSet.add(msg5);

        System.out.println(msgSet);
        System.out.println(msgSet.size()); // 5
    }
}

