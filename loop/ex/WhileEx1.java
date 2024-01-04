/*
문제와 풀이 1-1.
문제 : 자연수 출력
처음 10개의 자연수를 출력하는 프로그램을 작성해보세요. 이때, count라는 변수를 사용해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */
package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        // while문 사용
        int count = 1;
        while(count <= 10){
            System.out.println(count);
            count++;
        }
    }
}
