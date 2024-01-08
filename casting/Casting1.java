/*
작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다. ex) int -> long -> double
큰 범위에서 작은 범위는 소수점 버림, 오버플로우 문제가 발생할 수 있다.
범위 : int < long < double
 */

package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 작은 범위에서 큰 범위에 값을 대입하는 코드이다.

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // long에 int 대입
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // double에 int 대입
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // double에 long 리터럴 대입.
        System.out.println("doubleValue2 = " + doubleValue);

        /*
        - 출력
        longValue = 10
        doubleValue = 10.0
        doubleValue2 = 20.0
         */
    }
}
// 자바에서는 작은 범위에서 큰 범위로의 대입은 허용한다.
// 위 과정에서는 생략된 자동형변환의 과정이 숨겨져있다.