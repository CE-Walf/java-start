/*
문제와 풀이 1-4.
문제 - 합계와 평균
사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
 */

package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        double average;

        // 입력 받기
        System.out.println("5개의 정수를 입력하세요. :");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / 5;

        // 출력
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
