package ch_01;

/*
 * 1.7 (Approximating pi) This program displays the result of:
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * 
 */
public class Ex01_07 {
  public static void main(String[] args) {
    final double NUMERATOR = 1.0;
    int denominator; 
    final int MAX_DENOMINATOR = 13;
    final int DENOMINATOR_STEP = 2;
    double approxPi = 0.0; 
    boolean isAddition = true;

    for (denominator = 1; denominator <= MAX_DENOMINATOR; denominator = denominator + DENOMINATOR_STEP) {
      approxPi = approxPi + (isAddition ? (NUMERATOR / denominator) : -(NUMERATOR / denominator));
      isAddition = !isAddition;
    }
    approxPi = approxPi * 4;
    System.out.println(approxPi);
  }
}
