package array;

public class Array1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        // 만약 학생을 더 추가한다고 생각해보자.
        // 그렇다면 변수를 선언하는 부분과, 출력하는 부분의 코드를 추가적으로 추가해야한다.
        // 변수명이 다르므로 반복문으로도 해결하기 힘들다.
        // 배열을 사용해보자.

        System.out.println("학생1 점수 : " + student1);
        System.out.println("학생2 점수 : " + student2);
        System.out.println("학생3 점수 : " + student3);
        System.out.println("학생4 점수 : " + student4);
        System.out.println("학생5 점수 : " + student5);
    }
}
