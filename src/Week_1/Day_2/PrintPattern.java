package Week_1.Day_2;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fn(n);
    }
    public static void fn(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        fn(n-1);
        System.out.print(n+" ");
        fn(n-1);
    }
}
