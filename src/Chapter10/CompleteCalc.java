package Chapter10;

public class CompleteCalc extends Calculator{
    @Override
    public int divide(int num1, int num2) {
        return num1 /num2;
    }

    @Override
    public int times(int num1, int num2) {
        if(num2 !=0)
        return num2 * num2;
        else
            return Calc.ERROR;
        }

    @Override
    public void description() {
        super.description();
    }

    public void showInfo(){
            System.out.println("Calc인터페이스를 구현했습니다.");
    }
}
