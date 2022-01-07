package Chapter7.다시하기;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[]strArray=new String[]{"java","android","C","jacascript","python"};

        System.out.println("=======향상된 for문 =======");

        for(String developer : strArray){
            System.out.println(developer);
        }
    }
}
