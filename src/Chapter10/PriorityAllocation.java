package Chapter10;

public class PriorityAllocation implements  Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고객의 전화륾 먼저 가져온다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("일을 잘하는 상담원에게 우선적으로 배포한다.");

    }
}
