package Chapter7;
import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {

        ArrayList<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("치미","마티즈"));
       list.add(new Dog("리피","불독"));
        list.add(new Dog("헤버","시츄"));
        list.add(new Dog("병신","광견"));
        list.add(new Dog("죽여","도사견"));

        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i).showDogInfo());
        }
        System.out.println("=====================");

        for(Dog leepi : list) {
            System.out.println(leepi.showDogInfo());
        }

    }



    }



