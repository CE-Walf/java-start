/*
문제
1부터 시작해서 숫자를 계속 누적해서 더하다가 합꼐가 10보다 처음으로 큰 값은 얼마인가?
1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
 */
package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){ // 무한 반복
            sum += i; // sum = 1 + 2 + 3 + 4 + 5
            if (sum > 10){ // 합이 10보다 크면 while문 탈출
                System.out.println("합이 10보다 크면 종료: i=" + i + "sum=" + sum);
                break; // 반복문 탈출 : break
            }
            i++;
        }
    }
}
