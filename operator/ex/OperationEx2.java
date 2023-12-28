/*
문제2 - double과 평균
클래스 이름 : OperationEx2

다음 double 변수들을 선언하고, 그 합과 평균을 출력하는 프로그램을 작성하세요.
double var1 = 1.5;
double var2 = 2.5;
double var3 = 3.5;
 */

package operator.ex;

public class OperationEx2 {
    public static void main(String[] args) {
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum = var1 + var2 + var3;
        double average = sum / 3.;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
