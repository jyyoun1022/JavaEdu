package Chapter2;

public class Variable1 {

    //8진수는 2진수 3비트,16진수는 2진수 4비트 (2에3승,2에4승 이라고 생각하면 편함)
    //2진수를 사용할때는 숫자 앞에 0B,  8진수는 0, 16진수는 0X
    //3에 대한 N의보수 N-3 , if N=10일때, 3에대한 10의 보수는 7이된다.
    //2진수에서 2의보수 00000010에서 + X = 0이되는값 +1 =2의보수이자 -2를 나타내는 수



    public static void main(String[] args) {
        int level;
        level =10;                                 //    int level; //int는 자료형,  level 변수이름
        System.out.println(level);                 //    level = 10;  // 값 10을 level 변수에 대입
    }
}
