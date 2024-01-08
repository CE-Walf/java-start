/*
자바에서의 계산
1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
ex) int + int = int, double + double = double
2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
int + long = long + long, int + double = double + double
 */

package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int = int 이므로, int 타입으로 결과가 나온다.
        System.out.println("div1 = " + div1); // div1 = 1

        double div2 = 3 / 2; // int / int = int로 나온 결과를 double에 대입한다. (자동 형변환)
        System.out.println("div2 = " + div2); // div2 = 1.0

        double div3 = 3.0 / 2; // double / int = double
        System.out.println("div3 = " + div3); // div3 = 1.5

        double div4 = (double) 3 / 2; // 명시적 형변환, double / int = double
        System.out.println("div4 = " + div4); // div4 = 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // double / int = double
        System.out.println("result = " + result); // result = 1.5
    }
}