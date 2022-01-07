package Chapter12.collection;

public class Member implements Comparable<Member>{
    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.memberID == member.memberID)
                return true;
            else
                return false;
        }return false;

    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberID + "입니다.";
    }

    @Override
    public int compareTo(Member member ){
        return (this.memberID - member.memberID);    //compareTo()메서드 재정의.
                                                    //추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교한다.
        //이것은 오름차순이다. 만약 내림차순으로 정렬하려면  라턴 뒤에 *(-1)을하여 반환값을 음수로 만든다.
    }
}
