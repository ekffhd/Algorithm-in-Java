package chap01;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;

        do{
            System.out.print("단 수 : ");
            n = stdIn.nextInt();
        }while(n <=0);

        triangleLB(n);
        triangleLU(n);
        triangleRB(n);
        triangleRU(n);

    }

    static void triangleLB(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i+1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
