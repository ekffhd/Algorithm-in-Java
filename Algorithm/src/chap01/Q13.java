package chap01;

public class Q13 {
    public static void main(String[] args){
        System.out.print("   |");
        for(int i=0;i<10;i++){
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+------------------------------");

        for(int i=0;i<10;i++){
            System.out.printf("%3d|", i);
            for(int j=0;j<10;j++){
                System.out.printf("%3d",i+j);
            }
            System.out.println();
        }

    }
}
