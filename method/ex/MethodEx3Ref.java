/*
문제와 풀이 1.3 (풀이)
문제 - 입출금 리팩토링
다음은 입금, 출금을 나타내는 코드이다.
입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리팩토링 해보자.
 */
package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000); // 입금 1000
        balance = withdraw(balance, 2000); // 출금 2000

        System.out.println("최종 잔액 : " + balance);
    }

    // 이러한 과정들을 메서드 추출이라고 한다.
    // 입금 메서드
    public static int deposit(int balance, int amout) {
        balance += amout;
        System.out.println(amout + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    // 출금 메서드
    public static int withdraw(int balance, int amout) {
        if (balance >= amout) {
            balance -= amout;
            System.out.println(amout + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(amout + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

}
