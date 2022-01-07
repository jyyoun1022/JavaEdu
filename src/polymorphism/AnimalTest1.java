//package polymorphism;
//
//import java.util.ArrayList;
//
//class Animal {
//    public void move(){
//        System.out.println("동물이 움직입니다.");                       //상위 클래스 animal
//    }
//}
//class Human extends Animal{                                             //animal을 상속받은 Human
//    public void move(){
//        System.out.println("사람이 두발로 걷습니다.");
//    }
//    public void readBook(){
//        System.out.println("사람이 책을 읽습니다.");
//    }
//}
//class Tiger extends Animal{                                             //animal을 상속받은 tiger
//    public void move() {
//        System.out.println("호랑이가 네 발로 뜁니다.");
//    }
//    public void hunting(){
//        System.out.println("호랑이가 사냥을 합니다.");
//    }
//}
//class Eagle extends Animal{                                         //animal을 상속 받은 eagle
//    public void move() {
//        System.out.println("독수리가 하늘을 납니다.");
//    }
//    public void flying(){
//        System.out.println("독수리가 하늘을 쭉 펴고 멀리 날아갑니다.");
//    }
//
//}
//
//public class AnimalTest1 {
//     ArrayList<Animal>aniList= new ArrayList<Animal>();
//
//    public static void main(String[] args) {
//        AnimalTest1 aTest = new AnimalTest1();
//        aTest.addAnimal();
//        System.out.println("원래 형으로 다운 캐스팅");
//        aTest.testCasting();
//    }
//
//        public void addAnimal(){
//    aniList.add(new Human());
//    aniList.add(new Tiger());
//    aniList.add(new Eagle());
//
//    for(Animal ani : aniList){
//        ani.move();;
//    }
//    }
//
//    public void testCasting(){
//        for(int i =0; i<aniList.size(); i++){
//            Animal ani = aniList.get(i);
//            if(ani instanceof Human)
//        }
//    }
//
//
//
//    public  void moveAnimal(Animal animal){
//        animal.move();
//    }
//}
