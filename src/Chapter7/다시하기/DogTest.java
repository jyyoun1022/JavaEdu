package Chapter7.다시하기;
import java.util.ArrayList;
public class DogTest {
    public static void main(String[] args) {

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("비응신","버러지"));
        dogList.add(new Dog("ㅇㅈㄹㅇ","에라이"));
        dogList.add(new Dog("태환이는","또 쳐잔다"));
        dogList.add(new Dog("어휴","리얼ㅋ"));
        dogList.add(new Dog("자고있어","맨날잨"));

        for(int i =0; i< dogList.size(); i++){
            System.out.println(dogList.get(i).showDogInfo());
        }
        System.out.println("=======향상된for문형성==========");
        for(Dog d : dogList){
            System.out.println(d.showDogInfo());
        }


        // 하드코딩

//        Dog[]dog =new Dog[5];
//
//        dog[0]=new Dog("병신","시츄");
//        dog[1]=new Dog("시발","마티즈");
//        dog[2]=new Dog("개새끼","불독");
//        dog[3]=new Dog("리피","광견");
//        dog[4]=new Dog("병신","미친개");
//
//        for(int i =0; i< dog.length; i++){
//            System.out.println(dog[i].showDogInfo());
//        }
//
//        System.out.println("===================향상된 for문 ====================");
//        for(Dog d : dog){
//            System.out.println(d.showDogInfo());
//        }


    }
}
