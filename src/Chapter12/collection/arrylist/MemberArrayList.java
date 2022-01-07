package Chapter12.collection.arrylist;

import Chapter12.collection.Member;                 //Member 클래스는 collection패키지에 있으므로 사용하려면 import해야함
import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member>arrayList;                 //ArrayList 선언!

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();            //Member형으로 선언한 ArrayList생성!
    }

    public void addMember(Member member){
        arrayList.add(member);                          //ArrayList에 회원을 추가하는 메서드
    }
    public void insertMember(Member member, int position) {
        if(position <0 || position > arrayList.size()+1) {
            System.out.println("지정 된 자리에 추가할 수 없습니다");
            return;
        }
        arrayList.add(position-1, member);
    }


    public boolean removeMember(int memberID){
        for(int i =0; i< arrayList.size(); i++){
            Member member = arrayList.get(i);  //get()메서드로 회원을 순차적으로 가져온다.
            int tempID = member.getMemberID();  //변수tempID는 member클래스의 memberID를 반환
            if(tempID ==memberID){                          //회원아이디와 매개변수와 일치하면 해당 회원을 삭제.
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");              //반복문이 끝날 때까지 해당 아이디를 찾지 못했을 때
        return false;
    }

    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

}
