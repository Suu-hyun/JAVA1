package sec15;

class Car {
    private String carName;
    private String company;

    Car(String carName, String company) {
        this.carName = carName;
        this.company = company;
    }

    @Override
    public String toString() {
        return "차량 이름: " + carName + ", 제조사: " + company;
    }
}

public class Ex15_05 {
    public static void main(String[] args) {
        Car car = new Car("소나타", "현대");

        System.out.println(car);
    }
}
