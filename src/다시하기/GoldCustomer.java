package 다시하기;

public class GoldCustomer extends Customer_{
    double saleRatio;

    public GoldCustomer(int customerID,String customerName){
        super(customerID,customerName);
        customerGrade="GOLD";
        bonusRatio=0.02;
        saleRatio=0.1;
    }

    @Override
    public int calcPrice(int price) {
        super.calcPrice(price);
        return price -(int)(price*saleRatio);
    }
}
