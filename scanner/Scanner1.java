package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        // Scanner는 System.in을 사용해, 사용자의 입력을 편리하게 받도록 도와줌.
        Scanner scanner = new Scanner(System.in); // scanner 변수 선언

        // 문자열 입력 받기
        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 엔터(/n)를 입력할때까지 문자를 가져온다.
        System.out.println("입력한 문자열 : " + str);

        // 정수 입력 받기
        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt(); // 입력을 int형으로 가져온다.
        System.out.println("입력한 정수 : " + intValue);

        // 실수 입력 받기
        System.out.println("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble(); // 입력을 double형으로 가져온다.
        System.out.println("입력한 실수 : " + doubleValue);

        // 다른 타입 입력시, 오류가 발생하게 된다.

        //print() vs println() => print는 출력하고 다음 라인으로 넘기지 않고, println은 넘긴다.
    }
}
