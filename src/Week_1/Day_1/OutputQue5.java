package Week_1.Day_1;

public class OutputQue5 {
  public static void main(String[] args) {
    System.out.println(fun(10,15));
  }
  public static Integer fun(Integer a ,Integer b) {
    Integer c;
    for (c = 2; c <= 4; c++) {
      if (a % 2 < b % 3) {
        a = 4 % 3;
      } else {
        if (5 % 3 > b) {
          a = b;
        }
      }
      b = 3;
    }
    return a - b;
  }
}
