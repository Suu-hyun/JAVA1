package sec16;

class ClassInt {
    private int element;

    void set(int element) {
        this.element = element;
    }

    int get() {
        return element;
    }
}

class ClassDouble {
    private double element;

    void set(double element) {
        this.element = element;
    }

    double get() {
        return element;
    }
}

class ClassString {
    private String element;

    void set(String element) {
        this.element = element;
    }

    String get() {
        return element;
    }
}

// 제네릭
// 타입을 일반화
// 관례적으로 사용하는 타입 변수: E(Element), T(Type), K(Key), V(Value)
// 타입 변수 2개 이상 사용 가능: <K, V>
// 타입을 일반화하여 클래스나 메서드를 정의할 때, 사용할 데이터 타입을 나중에 지정할 수 있도록 하는 기능
class ClassGeneric<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }
}

public class GenericEXample {
    public static void main(String[] args) {
        ClassInt i = new ClassInt();
        i.set(1);
        System.out.println(i.get());

        ClassDouble d = new ClassDouble();
        d.set(1.234);
        System.out.println(d.get());

        ClassString s = new ClassString();
        s.set("제네릭이 필요합니다~");
        System.out.println(s.get());

        System.out.println("---");

        ClassGeneric<Integer> ig = new ClassGeneric<>();
        ig.set(1);
        System.out.println(ig.get());

        ClassGeneric<Double> dg = new ClassGeneric<>();
        dg.set(1.234);
        System.out.println(dg.get());

        ClassGeneric<String> sg = new ClassGeneric<>();
        sg.set("제네릭");
        System.out.println(sg.get());
    }
}
