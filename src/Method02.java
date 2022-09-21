import java.util.Scanner;
public class Method02 {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        문제 1) 사칙 연산을 하기 위한 메거드를 메서드의 4가지 형태로 가가
//        생성하여 실행하는 프로그램을 작성하세요
//        1) 더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 1번 타입의 함수 이름 : sum1, sub1, multi1, div1
//           2번 타입이 함수 이름 : sum2, sub2, multi2, div2
//           3번 타입이 함수 이름 : sum3, sub3, multi3, div3
//           4번 타입이 함수 이름 : sum4, sub4, multi4, div4
//        3. 각각의 함수를 모두 실행하여 결과를 확인



        System.out.println("-------문제1-1-------");
        sum1();
        sub1();
        multi1();
        div1();

        System.out.println("-------문제1-2 ------");
        sum2(10,3);
        sub2(10,3);
        multi2(10,3);
        div2(10,3);

        System.out.println("-------문제1-3------");
        int result = sum3();
        System.out.println(result);
        result = sub3();
        System.out.println(result);
        result = multi3();
        System.out.println(result);
        result = div3();
        System.out.println(result);

        System.out.println("-------문제1-4------");
        double dResult = sum4(10,3);
        System.out.println(dResult);
        dResult = sub4(10,3);
        System.out.println(dResult);
        dResult = multi4(10,3);
        System.out.println(dResult);
        dResult = div4(10,3);
        System.out.println(dResult);


//        문제 2) 사용자 입력을 통해서 2 ~ 9까지 숫자를 입력받아 해당하는 단수의
//        구구단을 출력하는 프로그램을 작성하세요
//        1. 구구단을 출력하는 부분을 함수로 구현(함수명 : gugudan)
//        2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨
            System.out.println("원하는 단을 입력하세요");
            Scanner scanner = new Scanner(System.in);
            int gugudan = scanner.nextInt();
            for (int i=1; i<10; i++){
                int a = gugudan;
                int b = i;
                System.out.println(a + "*" + b +"="+ (a * b) );
                }


//        문제 3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력 받고
//        총점과 평균, 등급을 출력하는 프로그램을 작성하세요.
//        1. 등급 계산 부분을 함수로 구현 (함수명 : scores)
//        2. 총점과 평균 계산 부분을 함수로 구현 (함수명 : average)
            System.out.print("당신의 국어 점수를 입력 하세요 : ");
            int num1 = scanner.nextInt();
            System.out.print("당신의 수학 점수를 입력하세요 : ");
            int num2= scanner.nextInt();
            System.out.print("당신의 영어 점수를 입력하세요 : ");
            int num3 = scanner.nextInt();
            char grade;

            int a = num1;
            int b = num2;
            int c = num3;
            int average = a + b + c;
            double scores= average/3.0;


            if(scores >= 90)
                grade = 'A';
            else if (scores >= 80)
                grade = 'B';
            else if (scores >= 70)
                grade = 'C';
            else if (scores >= 60)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("당신의 총점 : " + average + " 평균은 : "+scores +" 등급은 : " + grade +"입니다.");


            int kor = 0;
            int eng = 0;
            int math = 0;
            int total = 0;
            double avg = 0;
            String level = "F";








            }













        public static void sum1(){
            int a = 10;
            int b = 20;
            int result = a + b;
            System.out.println(result);
        }
        public static void sub1(){
            int a = 10;
            int b = 20;
            int result = a - b;
            System.out.println(result);
        }
        public static void multi1(){
            int a = 10;
            int b = 20;
            int result = a * b;
            System.out.println( result);
        }
        public static void div1(){
            int a = 10;
            int b = 20;
            int result = a / b;
            System.out.println( result);
        }

        public static void sum2(int a, int b){
            int reuslt = a + b;
            System.out.println( reuslt);
        }
        public static void sub2(int a, int b){
            int reuslt = a - b;
            System.out.println(reuslt);
        }
        public static void multi2(int a, int b){
            int reuslt = a * b;
            System.out.println(reuslt);
        }
         public static void div2(int a, int b){
        int reuslt = a/b;
        System.out.println(reuslt);
        }

        public static int sum3(){
            int a = 10;
            int b = 20;
            int result = a + b;
            return result;
        }

        public static int sub3(){
            int a = 10;
            int b = 20;
            int result = a - b;
            return result;
        }

        public static int multi3(){
        int a = 10;
        int b = 20;
        int result = a * b;
        return result;
        }

        public static int div3(){
            int a = 10;
            int b = 20;
            int result = a / b;
            return result;
        }
        public static double sum4(int a, int b){
            double result = a+b;
            return result;
        }

        public static double sub4(int a, int b){
            double result = a-b;
            return result;
        }

        public static double multi4(int a, int b){
            double result = a*b;
            return result;
        }

        public static double div4(int a, int b){
            double result = a/b;
            return result;
        }
    public static void gugudan(int dan){
        for (int i =1; 1 < 10; i++){
            System.out.println(dan +);
        }

    }













}
