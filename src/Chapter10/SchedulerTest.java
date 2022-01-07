package Chapter10;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("전화상담 할당 방식을 선택하시오");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객을 먼저 할당" );
        System.out.println("A : 상담원이 본인이 필요할 때 할당");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch =='R' || ch =='r'){
            scheduler = new RoundRobin();
        }
        else if(ch =='L' || ch =='l'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P' || ch =='p'){
            scheduler=new PriorityAllocation();
        }
        else if(ch =='A' || ch =='a'){
            scheduler=new AgentGetCall();
        }
        else{
            System.out.println("지원하지 않는 기능입니다.");



        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();    //어떤 정책인가와 상관없이 인터페이스에 선언한 메서드 호출
    }
}
