package sec11;

class Animal {
  void cry() {}
}

class Pig extends Animal {
  @Override
  void cry() {
    System.out.println("꿀꿀");
  }
}

class Cow extends Animal {
  @Override
  void cry() {
    System.out.println("음머");
  }
}

class Dog extends Animal {
  @Override
  void cry() {
    System.out.println("멍멍");
  }
}

class Tiger extends Animal {
  @Override
  void cry() {
    System.out.println("어흥");
  }
}

class Farm {
  void sound(Animal animal) {
    animal.cry();
  }
}

public class Ex11_17 {
  public static void main(String[] args) {
    Farm farm = new Farm();
    Pig pig = new Pig();
    Cow cow = new Cow();

    farm.sound(pig);
    farm.sound(cow);
    farm.sound(new Dog());
    farm.sound(new Tiger());
  }
}
