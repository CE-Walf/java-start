package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력 a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력 a * b = 10

        // 나눗셈
        // 2.5가 아니라 2인 이유 => int형 끼리 계산하였기 때문에.
        // 자바에서 같은 int형끼리 계산하면 int형이다. (소숫점 포함 X)
        // 0으로 나누는 것은 수학에서 허용하지 않으므로 오류가 발생하게 된다.
        int div = a / b;
        System.out.println("a / b = " + div); // 출력 a / b = 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력 a % b = 1
    }
}
