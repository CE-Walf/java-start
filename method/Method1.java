package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력 : " + sum1);

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력 : " + sum2);

        // 이런식으로 더하는 중복의 과정이 있을때, 어떻게 효율적으로 풀 수 있을까? 함수?!
    }
}
