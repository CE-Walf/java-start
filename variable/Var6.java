package variable;

public class Var6 {
    public static void main(String[] args) {
        // 변수는 반드시 초기화를 해야한다.
        // 자바는 변수를 강제로 초기화하도록 강제한다.
        // 선언만 하고 사용하지 않으면, 자바가 최적화를 한다.
        int a;
        // 컴파일 에러 발생 (아래 주석 풀면 오류 발생)
        //System.out.println(a);
    }
}
