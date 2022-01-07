package Chapter6_2;

public class Exercise01010 {
    int a=10,b=20;
    int add(){
        return a+b;
    }
    static int add(int x ,int y){
        return x +y;
    }

    public static void main(String[] args) {
        System.out.println(Exercise01010.add(20,30));
        Exercise01010 mymethod = new Exercise01010();
        System.out.println(mymethod.add());
    }


}
