package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열의 생성과 초기화를 이렇게 간략하게 할 수도 있다. new int[] 생략 가능

        // 허나 선언과, 생성 + 초기화를 다른 줄에서 하면 안된다.
        // int[] students;
        // students = {90, 80, 70, 60, 50};

        // 변수 값 출력
        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수 : " + students[i]);
        }

    }
}
