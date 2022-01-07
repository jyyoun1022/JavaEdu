package 별찍기;
import  java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("홀수 정수를 입력해주세요");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=num-1; i++){
            for(int j=1;j<=i; i++){
                System.out.println(" ");
            }
//            for(int k=)
        }
    }
}
