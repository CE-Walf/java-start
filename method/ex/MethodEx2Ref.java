/*
문제와 풀이 1.2 (풀이)
문제 - 반복 출력 리팩토링
다음은 특정 숫자만큼 같은 메세지를 반복 출력하는 기능이다.
메서드를 사용해서 리팩토링해보자.
 */

package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message,3);
        printMessage(message,5);
        printMessage(message,7);

    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++){
            System.out.println(message);
        }
    }
}
