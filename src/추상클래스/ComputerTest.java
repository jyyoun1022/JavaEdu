package 추상클래스;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer c1 = new Computer();
        Computer c2 = new DeskTop();
//        Computer c3 = new NoteBook();    //추상클래스는 모든 메서드가 구현되지 않아서,인스턴스로 생성할 수 없다.
        Computer c4 = new MyNoteBook();
    }
                        //추상클래스는 상속을 하기 위해 만든 클래스입니다.!!!
                    //추상클래스에서 구현하는 메서드는 하위클래스에서도 사용할, 즉 하위 클래스에서도 구현 내용을 공유할 메서드를 구현
                //만약 실제 하위 클래스에서 내용을 각각다르게 구현해야한다면,이것을 추상메서드로 남겨두고 하위 클래스에 구현을 위임한다.

    //구현된 메서드 : 하위클래스에서 공통으로 사용할 구현 코드. 하위 클래스에서 재정의 할 수 있음.
    //추상 메서드  : 하위클래스가 어떤 클래스냐에 따라 구현 코드가 달라짐.

}
