package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // 조건을 만족시키기 않아, 한번도 반복문을 실행하지 않는다.
        while(i < 3){
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
