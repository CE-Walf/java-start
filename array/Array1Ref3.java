package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students; // 배열 선언
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화

        // 변수 값 출력
        for (int i = 0; i < students.length; i++){ // 5 대신, students.length도 가능
            System.out.println("학생" + (i+1) + " 점수 : " + students[i]);
        }

    }
}
