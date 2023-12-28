package operator;

public class Operator3 {
    public static void main(String[] args) {

        //괄호가 *보다 더 높은 우선순위
        int sum1 = 1 + 2 * 3; // 1 + (2 + 3)
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1); // 출력 : sum1 = 7
        System.out.println("sum2 = " + sum2); // 출력 : sum2 = 9
    }
}
