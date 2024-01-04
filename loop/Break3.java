/*
for문 없이 while문으로 모든 반복을 다룰 수 있다.
하지만, 카운터 변수(i)가 명확하거나, 반복 횟수가 정해진 경우 for문을 사용하는 것이 구조적으로 깔끔하며, 유지보수하기에 좋다.
 */
package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1;;i++){
            sum += i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
