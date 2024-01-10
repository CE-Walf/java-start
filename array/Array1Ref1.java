package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        // Array1의 내용을 배열로 진행해보자.

        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        // 자바는 배열을 생성할때 그 내부 값을 자동으로 초기화 해준다. (0, false, null)

        // 참조 값을 보고싶을때, System.out.println(students);

        // 변수 값 대입 (배열은 0번부터 시작한다.)
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 출력
        System.out.println("학생1 점수 : " + students[0]);
        System.out.println("학생1 점수 : " + students[1]);
        System.out.println("학생1 점수 : " + students[2]);
        System.out.println("학생1 점수 : " + students[3]);
        System.out.println("학생1 점수 : " + students[4]);



    }
}
