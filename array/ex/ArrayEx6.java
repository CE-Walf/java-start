/*
문제와 풀이 2-1.
문제 - 가장 작은 수, 큰 수 찾기
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.
실행 결과 예시를 참고하자.
 */
package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열의 크기 입력 받기
        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        // 배열 내용 입력 받기
        System.out.println(n + "개의 정수를 입력하세요. : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // 최대 최소 찾기
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // 출력
        System.out.println("가장 작은 수 : " + min);
        System.out.println("가장 큰 수 : " + max);
    }
}
