package Chapter13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[]arr = new int[5];

        try{
            for(int i =0; i<=5; i++){
                arr[i]=i;
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("예외처리된 부분");
        }
        System.out.println("프로그램 종료");

        try {
            FileInputStream fis = new FileInputStream("a.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
