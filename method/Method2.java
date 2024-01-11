package method;

public class Method2 {
    // 매개변수가 없거나 반환 타입이 없는 경우
    public static void main(String[] args) {
        printHeader(); // printHeader 메서드 호출
        System.out.println("프로그램이 동작합니다.");
        printFooter(); // printFooter 메서드 호출
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다. = ");
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다. = ");
    }
    // 두 메서드는 매개변수가 없고, 반환타입도 없다.(void)
    // String str = printHeader(); 이런식으로 반환값을 받으면 컴파일 오류가 발생한다.
    // 모든 메서드는 항상 return을 호출해야하는데, void는 반환값이 없으므로 생략 가능하다. (어차피 안넣으면 자바 컴파일러가 넣어줌)
}
