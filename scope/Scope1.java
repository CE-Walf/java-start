package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료

        //System.out.println("main x = " + x); // 오류가 나타난다. x는 if 블록 안에서만 생존하므로, 접근이 불가능하다.
        System.out.println("main m = " + m);
    } // m 생존 종료 (main method, 즉 프로그램에 끝날때 종료)
}
// 지역변수는 본인의 코드 블록 안에서만 생존한다.
// 변수에 접근 가능한 범위롤 Scope라고 한다. m 은 main{}, x는 if{}가 Scope