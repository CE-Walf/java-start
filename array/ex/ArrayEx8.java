/*
문제와 풀이 2-2.
문제 - 2차원 배열 1
사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 */
package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수 입력 받기
        System.out.print("학생수를 입력하세요. : ");
        int n = scanner.nextInt();

        int[][] scores = new int[n][3]; // 4명의 학생 : 행, 3개의 과목 : 열
        String[] subjects = {"국어", "영어", "수학"};

        // 입력 받기
        for (int i = 0; i < n; i++){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요. : ");
            for(int j = 0; j < 3; j++){
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 출력
        for (int i = 0; i < n; i++){
            int total = 0;
            for (int j = 0; j < 3; j++){
                total += scores[i][j];
            }
            double average = total / 3.0;

            System.out.println((i+1)+"번 학생의 총점 : " + total + ", 평균 : " + average);
        }

    }
}
