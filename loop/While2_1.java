/*
문제 : 1부터 하나씩 증가하는 수를 3번 더해라 (1 ~ 3 더하기)
이 문제는 1부터 하나씩 증가하는 수이기 때문에 1 + 2 + 3을 더해야 한다.
우선 while문을 사용하지 않고 단순 무식하게 풀어보자.
 */

package loop;
public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        sum = sum + 1; //sum(0) + 1 -> sum(1)
        System.out.println("i=" + 1 + " sum=" + sum);

        sum = sum + 2; //sum(1) + 2 -> sum(3)
        System.out.println("i=" + 2 + " sum=" + sum);

        sum = sum + 3; //sum(3) + 3 -> sum(6)
        System.out.println("i=" + 3 + " sum=" + sum);
    }
}