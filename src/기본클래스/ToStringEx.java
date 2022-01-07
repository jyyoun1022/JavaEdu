package 기본클래스;

// 기본으로 제공하는 toStirng 메서드는 이름처럼 객체 정보를 문자열(String)으로 바꾸어 줍니다.
//Object 클래스를 상속 받은 모든 클래스는 toString()을 재정의 할수 있따.
//toString()메서드는 인스턴스 정보를 문자열로 반환하는 메서드입니다.
//toString()메서드의 원형은 생성된 인스턴스의 클래스 이름과 주소 값을 보여준다.

class Book{
    public int bookNumber;
    public String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookNumber + "," + bookTitle;   //본래 이 toString을 재정의 하지 않는다면, 밑에 book1,book1.toString()은 주소값이 출력된다.
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200,"개미");

        System.out.println(book1);  //인스턴스 정보(클래스 이름.주소 값)
        System.out.println(book1.toString()); //위의 출력문에 참조 변수를 넣으면 인스터스 정보가 출력되는데, 이때 자동으로 호출되는 메서드가 toString()이다.여기서 호출되는 toString()은 Object클래스의 메서드이다.

        //Object 클래스의 toString()의 원형
        //getClass().getName +  '@'  + Integer.toHexString(hashCode())
        //    (클래스 이름)                    (해시 코드 값)

    }
}
