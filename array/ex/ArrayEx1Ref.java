/*
문제와 풀이 1-1.
다음 문제를 배열을 사용해서 계산하자.
 */

package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;

        for (int student : students) { // Alt + Enter 기능
            total += student;
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);
    }
}
