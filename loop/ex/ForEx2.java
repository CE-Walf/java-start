/*
문제와 풀이 1-2.
문제 : 짝수 출력
반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해보세요.
이때 num이라는 변수를 사용하여 수를 표현해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */

package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        // for문 사용

        // 여러가지 선언 가능하다. (이런식으로)
//        for(int num = 2, count = 1; count <= 10; num += 2, count++){
//            System.out.println(num);
//        }

        // 더 깔끔한 코드.
        int num = 2;

        for(int count = 1; count <= 10; count++){
            System.out.println(num);
            num += 2;
        }

    }
}
