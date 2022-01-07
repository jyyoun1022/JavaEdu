package Chapter12.collection.hashset;
import java.util.HashSet;
import java.util.Iterator;
import Chapter12.collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashSet;  //HashSet 선언
                                                                //+= HashSet<Member> hashSet = new HashSet<member();    (선언과 생성 동시에)
     public MemberHashSet(){
         hashSet=new HashSet<Member>();     //HashSet 생성
     }

     public void addMember(Member member){
         hashSet.add(member);                   //HastSet에 회원추가
     }
     public boolean removeMember(int memberID){
         Iterator<Member> ir = hashSet.iterator();       //Iterator를 활용해서 순회      //hasNext() : 읽어올 요소가 남아있는지 확인하는 메소드이다. 요소가 있으면 true, 없으면 false
         while(ir.hasNext()){                                                       //next() : 다음 데이터를 반환한다.
             Member member =ir.next();                  //회원을 하나씩 가져와서         //remove() : next()로 읽어온 요소를 삭제한다.
             int tempID =member.getMemberID();          //아이디를 비교
             if(tempID ==memberID){
                 hashSet.remove(member);                //회원삭제
                 return true;
             }
         }
         System.out.println(memberID+"가 존재하지 않습니다.");
         return false;
     }

     public void showAllMember(){
         for(Member member : hashSet){
             System.out.println(member);
         }
         System.out.println();
     }

}
