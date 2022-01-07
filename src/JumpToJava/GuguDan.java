package JumpToJava;

public class GuguDan {
    public int a;
    public int b;

    public GuguDan(){}

    public void Dan(int x){
        for(int i=1; i<10; i++){
            System.out.println(x+ "X" + i+"="+ x*i + "입니다.");
        }
    }

    public static void main(String[] args) {
        GuguDan gd = new GuguDan();
        for(int i=2;i<10; i++){
            gd.Dan(i);
            System.out.println();
        }
    }

}
