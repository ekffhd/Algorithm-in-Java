package chap01;

import java.util.Scanner;

class Sum {
    // sum of between a and b
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int sum = sumOf(a, b);

        System.out.print("sum : "+ sum);
    }

    static int sumOf(int a, int b){
        int sum = 0;
        for(int i = a; i <= b ; i++){
            sum += i;
        }

        return sum;
    }

}
