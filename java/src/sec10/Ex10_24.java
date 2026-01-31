package sec10;

class Car {
  void ride() {
    System.out.println("달립니다.");
  }
}

// final class Bus extends Car { // final 클래스는 자식을 만들 수 없음
class Bus extends Car {
  int peopleNum;

  Bus(int peopleNum) {
    this.peopleNum = peopleNum;
  }

  void takePerson() {
    System.out.println("승객이 버스에 탔습니다.");
    this.peopleNum++;
    System.out.println("총 탑승 승객: " + peopleNum + "명");
  }
}

class SchoolBus extends Bus {
  SchoolBus(int peopleNum) {
    super(peopleNum);
  }

  @Override
  void takePerson() {
    System.out.println("학생이 스쿨 버스에 탔습니다.");
    this.peopleNum++;
    System.out.println("총 학생 수: " + peopleNum + "명");
  }

  @Override
  void ride() {
    System.out.println("안전하게 천천히 달립니다!");
  }
}

public class Ex10_24 {
  public static void main(String[] args) {
    // Car car = new Car();
    // car.ride();

    Bus bus = new Bus(10);
    bus.takePerson();
    bus.takePerson();

    SchoolBus schoolBus = new SchoolBus(10);
    schoolBus.takePerson();
    schoolBus.takePerson();

    bus.ride();;
    schoolBus.ride();
  }
}
