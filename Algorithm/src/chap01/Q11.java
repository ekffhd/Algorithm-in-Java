package chap01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            n = stdIn.nextInt();
        }while(n <= 0);

        int store = n;
        int num=0;

        while(n >= 1){
            n = n / 10;
            num ++;
        }
        System.out.println(store +"의 자리수는 "+num+ " 입니다.");
    }
}
