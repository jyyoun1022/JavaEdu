package Chapter12;

public class Point <T,V>{
    public T x;
    public V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
    public T getX(){
        return x;
    }                                   //제네릭 메서드
    public V getY(){
        return y;
    }
    //한 점을 나타내는 Point클래스 두좌표 x,y는 정수일 수도 있고, 실수일 수도 있다. 그래서 T와V라는 자료형 매개변수로 표현.
    //그리고 이 변수들을 위한 메서드 getx,gety는 t,v를 반환하고 있으므로 제네릭 메서드다.
}

