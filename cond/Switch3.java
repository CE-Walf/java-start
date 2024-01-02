// break문이 없으면 어떻게 될까?
// 2등급도 3등급과 같이 3000원을 준다고 해보자.
package cond;

public class Switch3 {
    public static void main(String[] args) {
        // grade 1 : 1000
        // grade 2 : 3000 (변경)
        // grade 3 : 3000
        // 나머지 : 500
        int grade = 2;

        int coupon;
        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
        // switch문은 조건식이 특정 case와 같은지만 체크할 수 있다.
        // 쉽게 말해, 값이 같은지 확인하는 연산만 가능하다. (문자도 가능)
    }
}
