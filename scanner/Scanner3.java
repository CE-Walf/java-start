package scanner;

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        // 사용자로부터 두 개의 정수를 입력받고, 더 큰 수를 출력하는 프로그램을 작성해보자.
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요. : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요. : ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("더 큰 숫자 : " + num1);
        } else if (num1 < num2){
            System.out.println("더 큰 숫자 : " + num2);
        } else {
            System.out.println("두 숫자는 같습니다.");
        }

    }
}
