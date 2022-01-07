package Chapter10;

public class AgentGetCall implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담원이 다음 전화요청");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담원이 전화 상담을 가져 갔습니다.");

    }
}
