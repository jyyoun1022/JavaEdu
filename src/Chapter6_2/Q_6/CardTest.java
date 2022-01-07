package Chapter6_2.Q_6;

public class CardTest {
    public static void main(String[] args) {


        Card card = new Card();
        Card card2 = new Card();
        Card card3 = new Card("BC");

        System.out.println(card.getCardName()+"의 카드번호는" + card.getCardNum()+"입니다.");
        System.out.println(card2.getCardName()+"의 카드번호는" + card2.getCardNum()+"입니다");
        System.out.println(card3.getCardName()+ "의 카드번호는" + card3.getCardNum() +"입니다.");


    }

}