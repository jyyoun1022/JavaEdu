package Chapter6_2.Chapter6_cooperation;

public class Tans {
    public static void main(String[] args) {


        Student james = new Student("james", 10000);
        Student tomas = new Student("tomas", 20000);
        Student adward = new Student("adward", 30000);
        Student lime = new Student("lime", 50000);

        Bus busM6410 = new Bus("M6410");
        Bus bus905 = new Bus("905");
        james.takeBus(busM6410);
        lime.takeBus(bus905);
        james.showInfo("james");
        lime.showInfo("lime");
        bus905.showInfo();
        busM6410.showInfo();

        Subway subway2호선 = new Subway("2호선");
        james.takeSubway(subway2호선);
        lime.takeSubway(subway2호선);
        james.showInfo("james");
        lime.showInfo("lime");
        subway2호선.showInfo("2호선");




    }
}
