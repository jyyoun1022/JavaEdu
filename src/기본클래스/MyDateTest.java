package 기본클래스;

class MyDate{
    public int day;
    public int month;
    public int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof MyDate){
           MyDate myD = (MyDate)obj;
           return (this.day == myD.day && this.month == myD.month && this.year == myD.year);}
               else {
                   return false;
       }
    }
       @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return day+month+year;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9,18,2004);
        MyDate date2 = new MyDate(9,18,2004);
        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
