/*
새로운 문제 : i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)
 */
package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // i가 endNum보다 작거나 같을때만 반복문 실행
        while(i <= endNum){
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }

    }
}
