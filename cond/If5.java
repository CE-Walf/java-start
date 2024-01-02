/*
문제
온라인 쇼핑몰의 할인 시스템을 개발해야한다.
한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
각각의 할인 조건은 다음과 같다.

- 아이템 가격이 10000원 이상일 때, 1000원 할인
- 나이가 10살 이하일때, 1000원 할인

이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다.
예를 들어, 10000원짜리 아이템을 구매할 때 1000원 할인을 받고, 동시에 나이가 10살 이하이면 추가로 1000원 할인을 더 받는다.
그래서 총 2000원까지 할인을 받을 수 있다.
 */

package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 10; // 나이
        int discount = 0;

        // 이 두개의 조건문은 할인에 대한 조건이 두개이므로 따로 작성해야 한다.
        // 독립적으로 이루어져야 한다.
        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        // 코드가 한 줄일 경우, {}를 생략 가능하다.
        // 하지만, 가독성이나 유지보수성을 위해 if문의 명령이 한개만 있을 경우에도, 중괄호를 사용하는 것이 좋다.
        if (true)
            System.out.println("if문에서 실행됨");
    }
}