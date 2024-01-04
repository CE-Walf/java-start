// i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라. (i ~ endNum 더하기)
package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for(int i = 1; i <= endNum; i++){
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }
        // for문은 초기화, 초건검사, 반복 후 작업 등이 규칙적으로 한 줄에 모두 들어있어 코드를 이해하기 더 쉽다.
    }
}
