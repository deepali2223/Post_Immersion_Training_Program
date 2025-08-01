package Week_1.Day_1;

public class OutputQue {
  public static void main(String[] args) {
    fun(40,4);
  }
  public static void fun(Integer w,Integer x){
    Integer y;
    y = 0;
    if(x%w == 0 || w%x == 0) {
      y = y + 1;
    }
      else{
        y = y+10;
      }
    System.out.println(y);
    }
  }
