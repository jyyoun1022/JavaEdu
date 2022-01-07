package 다시하기;

public class VIPCustomer_ extends Customer_ {
    private int agentID;
    double saleRatio;

    public VIPCustomer_(int customerID,String customerName,int agentID){
        super(customerID,customerName);
        this.agentID=agentID;
        customerGrade="VIP";
        saleRatio=0.1;
        bonusRatio=0.05;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price -(int)(price*saleRatio);
    }
//    public int calcPrice(int price){
//        bonusPoint += price * bonusRatio;
//        return price-(int)(price * saleRatio);
//    }

    public String showCustomerInfo(){
        return super.showCustomerInfo()+"담당 상담원 번호는" + agentID +"입니다.";
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
