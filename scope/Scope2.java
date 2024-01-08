package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        // for문 안의 초기식에서 직접 변수 선언 가능, 이는 for문 코드 블록 안에서만 사용할 수 있다.
        for(int i = 0; i < 2; i++){ // 블록 내부, for문 내
            System.out.println("for m = " + m);
            System.out.println("for i = " + i); // for문이 끝나면 i에 접근 불가
        } // i 생존 종료

        System.out.println("main m = " + m);
        //System.out.println("main i = " + i); // i는 for문 내부에서만 존재가능하므로 오류가 나타난다.
    }
}
