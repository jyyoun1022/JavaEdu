package Chapter7;

public class Q2 {
    public static void main(String[] args) {
        char[] alphabets=new char[26];
        char ch1='A';

        for(int i =0; i< alphabets.length; i++){
            alphabets[i]=ch1;
            ch1++;
        }
        for(int i =0; i< alphabets.length; i++){
            alphabets[i] = (char)( alphabets[i] + 32);
        }
        for(int i =0;i< alphabets.length; i++){
            System.out.println(alphabets[i]+ "," + (int)alphabets[i]);
        }

    }
}
