package Chapter6_2.Q_6;

public class Card {
    private int cardNum;
    private static int serialNum=10000;
    private String cardName;

    public Card(){
        serialNum++;
        this.cardNum=serialNum;
    }

    public Card(String cardName){
        serialNum++;
        this.cardNum= serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Card.serialNum = serialNum;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
