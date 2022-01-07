package Chapter5;

public class James {
    public static void main(String[] args) {
        Man man = new Man() ;

        man.age=40;
        man.name ="James";
        man.countChildren=3;
        man.married = true;


        System.out.print("나이는 :" + man.age);
        System.out.println( );
        System.out.print("이름은 :" + man.name);
        System.out.println();
        System.out.print("자식수는 :" + man.countChildren);
        System.out.println();
        System.out.print("결혼은 했는가 :" + man.married);



    }
}