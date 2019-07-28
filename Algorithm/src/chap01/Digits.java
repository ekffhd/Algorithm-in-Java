package chap01;

import java.util.Scanner;

public class Digits {
    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("입력 : ");
            n = stdIn.nextInt();
        }while(n < 10 || n > 99);

        System.out.println("변수의 값은 " + n + " 입니다.");
    }
}
