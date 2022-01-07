package Chapter4;

public class Switch {
    public static void main(String[] args) {
        int ranking =1;
        char medalColor;

        switch(ranking){
            case 1 : medalColor ='G';
            break;
            case 2 : medalColor = 'S';
            break;
            case 3 : medalColor = 'B';
            break;
            default:medalColor = 'A';
        }
        System.out.println("Ranking" + ranking + "등은" + medalColor+ "색입니다.");
    }
}
