package Week_1.Day_2;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem+ sumOfDigits(n/10);
    }
}
