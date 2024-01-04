// do-while문은 최초 한번은 코드 블럭을 꼭 실행해야 하는 경우에 사용하면 된다.
package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        // 조건을 만족하지 않더라도, 최초 한번은 실행한다.
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while(i < 3);
    }
}
