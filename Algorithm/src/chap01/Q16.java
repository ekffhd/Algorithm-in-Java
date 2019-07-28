package chap01;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("단 수 : ");
        int n = stdIn.nextInt();

        spira(n);
    }

    static void spira(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2 + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
