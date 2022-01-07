package Chapter10.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = new Customer();     //Customer buyer = new Buy();
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        if(seller instanceof Customer){
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }
        customer.order();
    }
}
