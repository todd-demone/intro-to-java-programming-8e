package ch_01;

/*
 * 1.7 (Approximating pi) This program displays the result of:
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * 
 */
public class Ex01_07 {
  public static void main(String[] args) {

    final double NUMERATOR = 1.0;
    final int MAX_DENOMINATOR = 13;
    final int DENOMINATOR_STEP = 2;

    int denominator; 
    double approxPi = 0.0; 
    boolean isAddition = true;

    // Calculate the portion of the PI formula that is inside the parentheses:
    for (denominator = 1; denominator <= MAX_DENOMINATOR; denominator = denominator + DENOMINATOR_STEP) {

      approxPi = approxPi + (isAddition ? (NUMERATOR / denominator) : -(NUMERATOR / denominator));

      // toggle between addition and subtraction
      isAddition = !isAddition;
    }

    // To complete the calculation, multiply the value inside the parentheses by 4
    approxPi = approxPi * 4;

    System.out.println(approxPi);
  }
}
