package Chapter6_2;

public class TakeTrans {
    public static void main(String[] args){
        Student james = new Student("James",5000);
        Student tomas = new Student("Tomas",10000);
        Student edward = new Student("Edward",50000);
        Student lime = new Student("Lime",7000);


        Bus  bus100 = new Bus(100);
        james.takebus(bus100);
        lime.takebus(bus100);
        james.showInfo();
        lime.showInfo();
        bus100.showInfo();


        Subway subwayGreen = new Subway("2호선");
        tomas.takeSubway(subwayGreen);
        james.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();

        Taxi taxi = new Taxi("보람상조");
        edward.takeTaxi(taxi);
        edward.showInfo();
        taxi.showInfo();



    }
}
