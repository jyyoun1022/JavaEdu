package Chapter7;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray ={"Java","Android","C","JacaScript","Phython"};

        for(String lang : strArray){
            System.out.println(lang);  //향상된 for문   >> for(변수 : 배열){
                                        // 반복실행문 ;  }                           Sting형 strArray배열의 요소값을 순서대로 String형 lang에 대입한다.
        }
    }
}
