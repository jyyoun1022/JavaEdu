package Chapter10;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1=10;
        int num2 =5;

        CompleteCalc CompleteC = new CompleteCalc();
        System.out.println(CompleteC.add(num1,num2));
        System.out.println(CompleteC.substract(num1,num2));
        System.out.println(CompleteC.times(num1,num2));
        System.out.println(CompleteC.divide(num1,num2));
        CompleteC.showInfo();
        CompleteC.description(); //디폴트 메서드 호출

        int[] arr = {1,2,3,4,5};

        System.out.println(Calc.total(arr));  //정적 메소드 사용하기





    }
}

