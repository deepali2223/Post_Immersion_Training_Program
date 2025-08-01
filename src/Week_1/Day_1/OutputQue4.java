package Week_1.Day_1;

public class OutputQue4 {
  public static void main(String[] args) {
    Integer a,b;
    a = 3;
    b = 3;
    a = b;
    boolean f = true;
    if(f ^f){
      a = 1;
    }
    else {
      b = 2;
    }
    System.out.println(a+b);
  }
}
