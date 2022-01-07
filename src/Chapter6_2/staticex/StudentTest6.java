package Chapter6_2.staticex;

public class StudentTest6 {
    public static void main(String[] args) {

        Student3 studentKim = new Student3();
        System.out.println("학번: " + studentKim.studentID + ", 카드 번호: " + studentKim.cardNumber);
        System.out.println("id : "+studentKim.studentID + " card number : " + studentKim.cardNumber + " serialnum : " +Student3.getSerialNum());
        Student3 studentLee = new Student3();
        System.out.println("학번: " + studentLee.studentID + ", 카드 번호: " + studentLee.cardNumber);
        System.out.println("id : "+studentLee.studentID + " card number : " + studentLee.cardNumber + " serialnum : " +Student3.getSerialNum());
    }
}


