/*
문제
1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
for문 사용
 */
package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // 조건이 없기 때문에, 무한 반복하는 코드가 된다. while(true)와 같다.
        for(;;){
            sum += i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
