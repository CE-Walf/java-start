/*
문제 1 - int와 평균
다음과 같은 작업을 수행하는 프로그램을 작성하세요.
클래스 이름은 OperationEx1라고 적어주세요.

1. num1, num2, num3라는 이름의 세개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화하세요.
2. 세 변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int 변수에 저장하세요.
3. 세 변수의 평균을 계산하고, 그 결과를 average라는 이름의 int 변수에 저장하세요.
    평균 계산 시 소수점 이하의 결과는 버림하세요.
4. sum과 average 변수의 값을 출력하세요.

참고
자바에서 int끼리의 나눗셈은 자동으로 소수점 이하를 버린다.
*/

package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3; // int형 끼리의 연산이므로, 자동으로 소숫점 이하는 버림

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
