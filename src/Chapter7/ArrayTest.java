package Chapter7;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10,20,30,40,50};
//        char[] arr2 = {'A', 'B', 'C', 'D', 'E'};

        System.arraycopy(arr1, 0, arr2, 1, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

