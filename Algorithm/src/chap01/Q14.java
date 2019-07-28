package chap01;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("단 수 : ");
        int n = stdIn.nextInt();

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
