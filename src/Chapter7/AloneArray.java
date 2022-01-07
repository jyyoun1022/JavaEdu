package Chapter7;

public class AloneArray {
    public static void main(String[] args) {
        char[][] alpabets=new char[13][2];
        char ch= 'a';

        for(int i =0; i< alpabets.length; i++){
            for(int j = 0 ; j< alpabets[i].length; j++){
                alpabets[i][j]=ch;
                System.out.print(alpabets[i][j] +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
