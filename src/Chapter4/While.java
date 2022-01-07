package Chapter4;

public class While {
    public static void main(String[] args) {
        int num =11;
        int sum =0;

        do{
            sum+=num;
            num++;

        }
        while(num<=10);
        System.out.println("1부터 10까지의 합은" + sum + "입니다.");
    }
}
