package 기본클래스;

//clone메서드 : 객체 원본을 유지해 놓고 복사본을 사용하거나,기본틀(프로토타입)의 복사본을 사용해 동일한 인스턴스를 만들어 복잡한 생성 과정을 간단히 하려는 경우에 clone()메서드를 사용할 수 있다.
//clone() 메서드는 protected Object clone();와 같이 선언되어 있으며, 객체를 복제해 또 다른 객체를 반환해 주는 메서드다.
//clone()메서드를 사용하려면 객체를 복제해도 된다는 의미로 클래스에 Cloneable 인터페이스를 구현해야한다.
//만약 clone()메서드만 재정의하고 Cloneable인터페이스를 명시하지 않으면 Clone메서드를 호출할때 CloneNotSupportedException이 발생한다.
//쉽게 말해서 Point point =new Point(); 여기서 new와 clone()와 같다고 보면편하다.
//Objectdml clone()메서드는 클래스의 인스턴스를 새로 복제하여 생성한다.멤버 변수가 동일한 인스턴스가 다른 메모리에 새로 생성되는 것.



class Point{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "X =" + x + "," + "Y =" + y ;
    }
}

class Circle implements Cloneable{
    Point point;
    int radius;

    public Circle(int x,int y,int radius){
        this.radius = radius;
        point=new Point(x,y);
    }

    @Override
    public String toString() {
        return "원점은" +point +"이고," + "반지름은" +radius +"입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {  //clone()메서드를 사용할 때 발생할 수 있는 오류를 예외처리한다.
        return super.clone();
    }
}


public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Circle circle =new Circle(10,20,30);

        Circle copyCircle =(Circle)circle.clone();  //clone()메서드를 사용해 circle인스턴스를 copyCircle에 복제함

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));


    }
}
