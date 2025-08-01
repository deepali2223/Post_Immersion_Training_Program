package Week_1.Day_2;

public class OutPutQues {
    public static void main(String[] args) {
        System.out.print(fn(5,3));
    }
    public static int fn(int x ,int y){
        if(y == 0 || y == x){
            return 1;
        }
        return fn(x-1,y)+fn(x-1,y-1);
    }
//    public static int fn(int x ,int y){
//        if(x==y){
//            return x*y;
//        }
//        return fn(x,(x+y)/2) + fn((x+y)/2+1,y);
//    }
}
