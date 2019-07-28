package chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            System.out.print("n의 값 : ");
            n = stdIn.nextInt();

        } while(n <= 0);

        int sum = 0;

        for (int i=0 ; i<=n ; i++){
            sum += i;
        }

        System.out.println("sum : " + sum);

    }
}
