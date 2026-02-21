package sec15.practice;

class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}

public class Practice_15_01 {
    public static void main(String[] args) {
        User user = new User("김철수", 22);

        System.out.println(user);
    }
}
