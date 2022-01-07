package Chapter5;

public class Mydate_getter_setter {
    private int day ;
    private int month;
    private int year;

    public void setDay(int day) {
        if(month == 2){
            if(day<1 ||day>38)
                System.out.println("오류입니다.");
            else{
                this.day = day;
            }
            }

    }
    //    public int getday(){
//        return day;
//    }
//    public void setDay(int day) {
//        this.day = day;
//    }
//    public int getmonth(){
//        return month;
//    }
//    public void setMonth(int month){
//        this.month=month;
//    }
//    public int getYear(){
//        return year;
//    }
//    public void  setYear(int year){
//        this.year=year;
//    }


//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public static void main(String[] args) {
//        Mydate_getter_setter md = new Mydate_getter_setter();
//        md.setDay(2);;
//        md.setYear(22);
//        md.setMonth(10);
//        System.out.println("일은:" + md.getDay()+"일");
//        System.out.println("연은:" + md.getYear()+"년");
//        System.out.println("달은:"+md.getMonth()+"월");

    }

