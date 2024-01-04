/*
문제와 풀이 1-3.
반목문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요.
이때, sum이라는 변수를 사용하여 누적합을 표현하고, i라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */
package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        // while문으로 진행해보자.
        int max = 100;
        int sum = 0;
        int i = 1;

        while(i <= max){
            sum += i;
            i++;
        }

        System.out.println(sum);


    }
}
