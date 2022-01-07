package Chapter7.다시하기;

public class Q2 {
    public static void main(String[] args) {
      //애초에 소문자로 아스키 값 추출하기
//        char[] alphabets =new char[26];
//        char ch ='a';
//
//        for(int i =0; i< alphabets.length; i++){
//            alphabets[i]=ch;
//            ch++;
//        }
//        for(int i=0; i< alphabets.length; i++){
//            System.out.println(alphabets[i]+"," +(int)(alphabets[i]));
//        }

        //소문자에서 대문자로 변환해 출력하기
        char[] alpthbets = new char[26];
        char ch = 'A';

        for(int i =0; i< alpthbets.length; i++){
            alpthbets[i]=ch;
            ch++;
            alpthbets[i]=(char)(alpthbets[i]+32);
        }

        for(int i=0; i< alpthbets.length; i++){
            System.out.println(alpthbets[i]+"," + (int)alpthbets[i]);
        }
    }
}
