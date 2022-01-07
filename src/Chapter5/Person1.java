package Chapter5;

import javax.xml.crypto.KeySelector;

public class Person1 {     //모든 클래스는 반드시 생성자를 가져야 한다.
    String name;
    float height;
    float weight;

    public Person1(){}  //매개변수가 없는 생성자


    public Person1(String pname,float pheight, float pweight){  //매개변수 있는 생성자      (위,아래를 생성자 오버로드)
        name =pname;
        height = pheight;
        weight = pweight;
    }


}
