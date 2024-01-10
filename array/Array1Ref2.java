package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 배열을 사용해서 리팩토링(코드 내부 개선)을 해보자.

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 출력
        for (int i = 0; i < 5; i++){ // 5 대신, students.length도 가능
            System.out.println("학생" + (i+1) + " 점수 : " + students[i]); // 문자 + 숫자 = 문자 조심
        }

    }
}
