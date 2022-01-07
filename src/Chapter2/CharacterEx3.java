package Chapter2;

public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        //char b2 = -66;

        System.out.println((char)a);
        System.out.println((char)b);    //음수값을 출력하면 오류가 발생 ?로 나온다
        System.out.println(a2);

        //float은 소숫점이하 6자리
        //double은 소숫점이하 15자리
        double dnum = 1;

        for(int i =0; i<10000; i++){
            dnum = dnum + 0.1;
        }
        System.out.println(dnum);

        boolean isMarried = true;
        System.out.println(isMarried);  //boolean형 변수는 true와 false만 대입할수 있다.

    }
}
