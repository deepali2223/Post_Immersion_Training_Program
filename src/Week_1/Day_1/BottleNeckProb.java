package Week_1.Day_1;

import java.util.Arrays;
import java.util.Scanner;

public class BottleNeckProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int c = 0;
        boolean flag[] = new boolean[n];
        for(int i=0;i<n;i++) {
            if (!flag[i]) {
                c++;
                flag[i] = true;
                int prev = a[i];
                for (int j = i + 1; j < n; j++) {
                    if (!flag[j] && prev < a[j]) {
                        flag[j] = true;
                        prev = a[j];
                    }
                }
            }
        }
            System.out.print(c);
    }
}
