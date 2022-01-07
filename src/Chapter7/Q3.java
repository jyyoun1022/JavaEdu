package Chapter7;

public class Q3 {
    public static void main(String[] args) {
        int [] num=new int[]{2,4,6,8,10};
        int total;
        int sum=0;

        for(int i =0; i< num.length; i++){
            sum+=num[i];

        }

        System.out.println("2부터 10까지 짝수의 합은 " + sum + "입니다");
    }
}
