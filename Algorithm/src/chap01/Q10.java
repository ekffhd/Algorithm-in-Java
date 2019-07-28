package chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b;

        while(true){
            b = stdIn.nextInt();

            if ( b > a ){
                break;
            }
            System.out.println("a보다 큰 값을 입력해주세요!");
        }

        System.out.println("b - a는 " + (b - a) + " 입니다.");
    }
}
