package sec14;

public class NumberFormat {
  public static void main(String[] args) {
    String str01 = "11";
    String str02 = "11.1";

    int num01 = Integer.parseInt(str01); 
    System.out.println(num01);
    
    // int num02 = Integer.parseInt(str02); // NumberFormatException
    // System.out.println(num02);

    double num02 = Double.parseDouble(str02);
    System.out.println(num02);
  }
}
