package 별찍기;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("정수를 입력하시오.");
        int num =sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<num; j++){   // " " 이것은 있어도 되지만 없어도 무방하다.
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
