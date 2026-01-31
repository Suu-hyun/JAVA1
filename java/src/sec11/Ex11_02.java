package sec11;

class Car {}

class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportCar extends OpenCar {}

public class Ex11_02 {
  public static void main(String[] args) {
    Car c1 = new SchoolBus();

    Bus b1 = new Bus();
    Bus b2 = new SchoolBus();

    Car c2 = new OpenCar();
    OpenCar o1 = new SportCar();

    // Bus b3 = new SportCar(); // Bus는 SportCar의 직접적인 상속 관계 아님!
  }
}
