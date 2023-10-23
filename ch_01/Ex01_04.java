package ch_01;

public class Ex01_04 {
  public static void main(String[] args) {
    int a;
    System.out.println("a\ta^2\ta^3");
    for (a = 1; a < 5; a++) {
      System.out.println(a + "\t" + (int) Math.pow(a, 2) + "\t" + (int) Math.pow(a, 3));
    }
  }
}
