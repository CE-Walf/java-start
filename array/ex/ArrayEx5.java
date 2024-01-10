/*
문제와 풀이 1-5.
문제 - 합계와 평균2
이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
 */

package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average;

        // 입력받을 숫자 받기
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        // 입력 받기
        int[] numbers = new int[n];
        System.out.println("5개의 정수를 입력하세요. :");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / numbers.length;

        // 출력
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
