import java.util.Arrays;
import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Arrays클래스의 정렬 메서드 sort()를 사용하여 정렬
//        int nums[] = {10, 50, 80, 70, 20};
//        for (int i = 0; i < nums.length; i++){
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        int numbars[] = new int[10];
//
//        System.out.println("정수 입력");
//        for(int i =0; i< numbars.length; i++){
//            numbars[i] = scanner.nextInt();
//        }
//        Arrays.sort(numbars);
//
//        for(int i = 0; i< numbars.length; i++){
//            System.out.println(numbars[i]+ "");
//        }
//        int numbers[] = new int [10];
        int numbers[];
        numbers = input();


        Arrays.sort(numbers);

        output(numbers);


        for(int i =0; i < numbers.length; i++){
            for(int j = 0; j< numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] =tmp;
                }
            }
        }











    }
//    public static void scoreInput(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수 10개 입력>>");
//        int intArray [] = new int[10];
//        for (int i =0; i<intArray.length; i++) {
//            intArray[i] = scanner.nextInt();
//        }
//    }
//
//



    public static int[] input(){
        Scanner scanner = new Scanner(System.in);
        int numbars[] = new int[10];

        System.out.println("정수 입력");
        for(int i =0; i< numbars.length; i++){
            numbars[i] = scanner.nextInt();
        }
        return numbars;
    }

    public static void output(int numbars[]) {
        for (int i = 0; i < numbars.length; i++) {
            System.out.print(numbars[i] + " ");
        }


    }
}
