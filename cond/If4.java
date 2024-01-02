// If3에서의 작업을 else if를 활용하여 진행해보자.

package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7){ // 7세 이하 : 미취학
            System.out.println("미취학");
        } else if (age <= 13) { // 13세 이하 : 초등학생
            System.out.println("초등학생");
        } else if (age <= 16) { // 16세 이하 : 중학생
            System.out.println("중학생");
        } else if (age <= 19){ // 19세 이하 : 고등학생
            System.out.println("고등학생");
        } else { // 나머지 : 성인
            System.out.println("성인");
        }
        // else는 생략 가능하다.
    }
}
