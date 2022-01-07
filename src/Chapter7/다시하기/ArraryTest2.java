package Chapter7.다시하기;

public class ArraryTest2 {
    public static void main(String[] args) {
        double[] data = new double[5];
        int sum =0;


        data[0]=10.0;
        data[1]=20.0;
        data[2]=30.0;

        for(int i=0; i<data.length; i++){
            sum +=data[i];
            System.out.println(data[i]);
            System.out.println(sum);
        }
    }
}
