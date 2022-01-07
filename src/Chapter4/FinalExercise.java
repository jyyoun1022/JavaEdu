package Chapter4;

public class FinalExercise {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '+';
        int result = 0;
       //1번문제

        if(operator =='+'){
            result =num1+num2;
        }
        else if(operator =='-'){
            result = num1 - num2;
        }
        else if(operator == '*'){
            result = num1 *num2;
        }
        else if(operator =='/'){
            result = num1 / num2;
        }
        else{
            System.out.println("연산자가 아닙니다.");
            return;
        }
        System.out.println("결과값은" + result + "입니다.");

        //2번문제

//       switch(operator){
//           case '+':result =num1 +num2;
//           break;
//           case '-':result = num1-num2;
//           break;
//           case '*':result = num1 *num2;
//           break;
//           case '/':result = num1 / num2;
//           break;
//           default:
//               System.out.println("연산자가 아닙니다.");
//               return;
//       }
//        System.out.println("결과값은" +result +"입니다." );

        //3번문제
//        int dan;
//        int times;
//        for(dan=2; dan<10; dan++){
//            if(dan%2!=0)
//                continue;
//            for(times=1; times<10;times++){
//                System.out.println(dan + "X" +times+ "=" + dan*times);
//            }
//            System.out.println();
//        }


//        for (dan = 2; dan < 10; dan++) {
//            for (times = 1; times < 10; times++) {
//                System.out.println(dan + "X" + times + "=" + dan * times);
//                if (dan <= times)
//                    break;
//            }
//
//            System.out.println();
//        }
        //4번문제,5번문제
        //for 문만 사용

//        for(int i =0; i<4; i++){
//            for(int j =3; j > i; j--){
//                System.out.print(" ");
//            }
//            for(int j =1; j<=i*2+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i =0; i<3; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(" ");
//            }
//            for(int j =6; j>i*2+1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        //반목문과 조건문을 사용해서.
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (i <= 7 / 2) {
//                    if (i + j <= 7 / 2 - 1) {
//                        System.out.print(" ");
//                    } else if (j - i >= 7 / 2 + 1) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                } else if (i > 7 / 2) {
//                    if (i - j >= 7 / 2 + 1)
//                        System.out.print(" ");
//                    else if (i + j >= 7 / 2 * 3 + 1)
//                        System.out.print(" ");
//                    else
//                        System.out.print("*");
//                }
//            }
//            System.out.println();


        }
    }

