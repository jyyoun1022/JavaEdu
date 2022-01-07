package Chapter7.다시하기;

public class AloneTwoDimension {
    public static void main(String[] args) {
        char[][]alpthabets=new char[6][4];
        char ch='a';

        for(int i =0; i< alpthabets.length; i++) {
            for (int j = 0; j < alpthabets[i].length; j++) {
                alpthabets[i][j] = ch;
                ch++;
                System.out.print(alpthabets[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
