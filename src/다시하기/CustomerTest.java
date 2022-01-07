package 다시하기;

public class CustomerTest {
    public static void main(String[] args) {
        Customer_ customer_Lee = new Customer_();
        customer_Lee.customerName="이순신";
        customer_Lee.customerID=10010;
        customer_Lee.bonusPoint=1000;

        System.out.println(customer_Lee.showCustomerInfo());


        Customer_ customer_Kim =new VIPCustomer_(10020,"김유신", 12345);
        customer_Kim.bonusPoint=1000;

        System.out.println(customer_Kim.showCustomerInfo());

        System.out.println("======할인율과 보너스 포인트 계산");



        int price =10000;
        int leePrice = customer_Lee.calcPrice(price);
        int kimPrice = customer_Kim.calcPrice(price);

        System.out.println(customer_Lee.customerName + "님이" + leePrice + "원 지불 하셨습니다.");
        System.out.println(customer_Lee.showCustomerInfo());

        System.out.println(customer_Kim.customerName + "님이" + kimPrice + "원 지불 하셨습니다.");
        System.out.println(customer_Kim.showCustomerInfo());


    }
}
