package Week_1.Day_2;

import java.util.Scanner;

public class HashingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "A red scarf";
        int freq[] = new int[256];
        for(char c : s.toCharArray()) {
            if(c >= 'a' && c<= 'z' || c>='A' && c<='Z')
            freq[c]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                char c = (char)(i);
                System.out.println("Character-->"+c+"freq is "+freq[i]);
            }
        }
    }
}
