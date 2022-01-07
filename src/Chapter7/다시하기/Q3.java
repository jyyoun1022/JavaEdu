package Chapter7.다시하기;

public class Q3 {
    public static void main(String[] args) {


        int[] num ={2, 4, 6, 8, 10};
        int sum=0;

        for (int i = 0; i < num.length; i++){
            sum +=num[i];
            System.out.println(num[i]);
        }
        System.out.println("1부터 10까지 중 짝의 합은" + sum + "입니다.");

//        int[] num=new int[5];

//        num[0]=2;
//        num[1]=4;
//        num[2]=6;
//        num[3]=8;
//        num[4]=10;
//        int sum=0;
//
//        for(int i=0; i< num.length; i++){
//            sum +=num[i];
//        }
//        System.out.println(sum);

    }
}
