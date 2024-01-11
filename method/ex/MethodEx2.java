/*
문제와 풀이 1.2 (문제)
문제 - 반복 출력 리팩토링
다음은 특정 숫자만큼 같은 메세지를 반복 출력하는 기능이다.
메서드를 사용해서 리팩토링해보자.
 */

package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        for(int i = 0; i < 3; i++) {
            System.out.println(message);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(message);
        }

        for(int i = 0; i < 7; i++) {
            System.out.println(message);
        }
    }
}
