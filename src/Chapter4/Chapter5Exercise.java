package Chapter4;

public class Chapter5Exercise {
    public static void main(String[] args) {
        int score =70;
        char grade = 'A';

        if(score>=90){
            grade = 'A';

        }
        else if(score>=80){
            grade = 'B';

        }
        else if(score >=70){
            grade = 'C';

        }
        else{
            grade ='F';

        }
        System.out.println(score + "점의 등급은" + grade + "입니다.");
    }
}
