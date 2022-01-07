package Chapter10;

public interface Calc {
    public static final double PI =3.14;
    public static final int ERROR = -999999999;        //인터페이스에서 선언한 변수는 컴파일과정에서 상수로 변한다.

    public int add(int num1, int num2);
    public  int substract(int num1, int num2);
    public int times(int num1, int num2);
    public int divide(int num1, int num2);

    private void myMethod(){
        System.out.println(" private 메서드 입니다.");
    }
    private  static void myStaticMethod(){
        System.out.println("private static 메서드 입니다.");
    }


    default void description(){
        myMethod();
        System.out.println("정수 계산기를 구현합니다.");
    }
    static int total(int[]arr){
        int total =0;

        for(int i : arr){
            total += i ;
        }
        myStaticMethod();
        return total;
    }


}
