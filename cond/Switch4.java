// 자바 14부터 새로 나온 switch문을 사용해보자.
package cond;

public class Switch4 {
    public static void main(String[] args) {
        // grade 1 : 1000
        // grade 2 : 2000
        // grade 3 : 3000
        // 나머지 : 500
        int grade = 2;

        int coupon = switch(grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        }; // 세미콜론 까먹지 말기

        System.out.println("발급받은 쿠폰 " + coupon);
        // 기존 switch문과의 차이는
        // - "->"를 사용한다.
        // - 선택된 데이터를 반환할 수 있다.
    }
}
