package 다시하기;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade="VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
        this.agentID=agentID;



    }

//    public VIPCustomer(){
//         customerGrade= "VIP";
//         bonusRatio=0.05;
//         saleRatio=0.1;
//        System.out.println("VIPCoustomer()생성자호출");
//
//    }
//
    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price-(int)(price*saleRatio);
    }


//    @Override
//    public int calcPrice(int price) {
//        return super.calcPrice(price);
//    }

    public int getAgentID(){
        return agentID;
    }
}
