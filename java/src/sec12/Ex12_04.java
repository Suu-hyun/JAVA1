package sec12;

abstract class Recipe {
  String chef;

  Recipe(String chef) {
    this.chef = chef;
  }

  void info() {
    System.out.println("이 레시피는 " + chef + " 셰프님의 레시피입니다.");
  }
}

class StakeRecipe extends Recipe {
  StakeRecipe(String chef) {
    super(chef);
  }

  void grillStake() {
    System.out.println("스테이크를 맛있게 굽습니다.");
  }
}

class PastaRecipe extends Recipe {
  PastaRecipe(String chef) {
    super(chef);
  }

  void makeSource() {
    System.out.println("파스타 소스를 만듭니다.");
  }
}

public class Ex12_04 {
  public static void main(String[] args) {
    // Recipe recipe = new Recipe(); // 추상 클래스는 객체 불가!
    PastaRecipe p = new PastaRecipe("최연석");
    p.makeSource();

    StakeRecipe s = new StakeRecipe("이현복");
    s.grillStake();
  }
}
