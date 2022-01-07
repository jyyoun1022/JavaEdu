package Chapter12.collection.arrylist;
import Chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001,"이지원");
        Member memberSon = new Member(1002,"손흥민");
        Member memberPark = new Member(1003,"박지성");
        Member memberHong = new Member(1004,"홍길동");             //새로운 회원 인스턴스 생성

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);                                      //ArrayList에 회원 추가

        memberArrayList.showAllMember();                    //전체 회원 출력

        memberArrayList.removeMember(memberHong.getMemberID());   //홍길동 회원 삭제
        memberArrayList.showAllMember();

        memberArrayList.insertMember(memberHong,4);
        memberArrayList.showAllMember();


    }
}
