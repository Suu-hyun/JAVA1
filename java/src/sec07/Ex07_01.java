package sec07;

public class Ex07_01 {
  public static void main(String[] args) {
    Person kim1 = new Person(); 
    // System.out.println(kim1);

    kim1.name = "김일남";
    kim1.age = 99;
    kim1.gender = 'M';
    kim1.height = 165.5;
    kim1.address = "부산";
    System.out.println(kim1.name);
    System.out.println(kim1.age);
    System.out.println(kim1.gender);
    System.out.println(kim1.height);
    System.out.println(kim1.address);

    // kim1.studyCoding();
    kim1.introduce();

    System.out.println("---");

    Person kim2 = new Person(); 
    // System.out.println(kim2);
    
    kim2.name = "김이남";
    kim2.age = 98;
    kim2.gender = 'M';
    kim2.height = 175.5;
    kim2.address = "양산";
    System.out.println(kim2.name);
    System.out.println(kim2.age);
    System.out.println(kim2.gender);
    System.out.println(kim2.height);
    System.out.println(kim2.address);
    
    kim2.introduce();

    // Person kim3 = new Person(); 
    // System.out.println(kim3);

    
  }
}
