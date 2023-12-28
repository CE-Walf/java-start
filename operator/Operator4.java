package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 헷갈리는 경우 괄호를 명시적으로 사용해주는 것이 더 좋다.
        // 코드를 조금 더 쓰더라도, 명확하고 단순한게 훨씬 더 유지보수하기 좋다.
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같다.
        System.out.println("sum3 = " + sum3); // 출력 : sum3 = 13
        System.out.println("sum4 = " + sum4); // 출력 : sum4 = 13
    }
}
