package 다시하기;
import java.security.AllPermission;
import java.util.ArrayList;

public class CustomerTest_ {
    public static void main(String[] args) {
        ArrayList<Customer_>customerList = new ArrayList<Customer_>();

        customerList.add(new Customer_(10010,"이순신"));
        customerList.add(new Customer_(10020,"신사임당"));
        customerList.add(new GoldCustomer(10030,"홍길동"));
        customerList.add(new GoldCustomer(10040,"이율곡"));
        customerList.add(new VIPCustomer_(10050,"김유신",12345));

        System.out.println("=====고객정보출력====");
        for(Customer_ customerInfo : customerList){
            System.out.println(customerInfo.showCustomerInfo());
        }

        System.out.println("======할인율과 보너스 계산=====");
        int price =10000;

        for(Customer_ customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.customerName+"님이" +cost + "원을 지불하셨습니다.");

            System.out.println(customer.customerName+ "님의 현재 보너스 포인트는" + customer.bonusPoint +"입니다.");

        }

    }
}
