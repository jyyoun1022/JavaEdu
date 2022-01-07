package Chapter6.thisex;

class Birthday{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void printThis(){
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {

        Birthday b1 =new Birthday();
        Birthday b2 =new Birthday();

        System.out.println(b1);
       b1.setYear(20);
        System.out.println(b1.getYear());

        System.out.println(b2);
        b2.printThis();
    }
}
