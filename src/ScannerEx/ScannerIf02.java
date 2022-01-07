package ScannerEx;
import java.util.Scanner;

public class ScannerIf02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요>>");
        int money = sc.nextInt();
        int a = money /50000;
        int b = (money-50000)/10000;
        int c = (money-50000-10000)/1000;
        int d = (money-a*50000-b*10000-c*1000)/500;
        int e = (money -a*50000-b*10000-c*1000-d*500)/100;
        int f = (money -a*50000-b*10000-c*1000-d*500-e*100)/10;
        System.out.println("오만원" +a+"개,"+"만원"+b+"개,"+"천원"+c+"개,"+"백원"+d+"개");



    }
}
