package Chapter12;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  //Powder형으로 GenericPrinter클래스 생성

        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); //Plastic형으로 GenericPrinter클래스 생성

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic =plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);


    }
}
