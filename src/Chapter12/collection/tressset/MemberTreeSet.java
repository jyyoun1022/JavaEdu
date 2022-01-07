package Chapter12.collection.tressset;
import java.util.Iterator;
import java.util.TreeSet;
import Chapter12.collection.Member;


public class MemberTreeSet {
    private TreeSet<Member> treeSet = new TreeSet<Member>();

    public void addMember(Member member){
        treeSet.add(member);                            //TreeSet에 회원을 추가하는 메서드
    }

    public boolean removeMember(int memberID){
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()){
            Member member =ir.next();
            int tempID =member.getMemberID();
            if(tempID == member.getMemberID()){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID+"가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }

}
