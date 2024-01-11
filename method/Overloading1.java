/*
메서드 오버로딩
이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것 => 메서드 오버로딩
즉, 같은 이름의 메서드를 여러개 정의했다는 것이 메서드 오버로딩이다.

메서드의 이름이 같아도, 매개변수의 타입 및 순서가 다르면 오버로딩 할 수 있다. (매개변수 정보로 구분)

+ 메서드 시그니처
자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명.
메서드 이름 + 매개변수 타입(순서 포함)으로 구성
즉, 메서드를 구분할 수 있는 기준
 */
package method;

public class Overloading1 {
    // 메서드 오버로딩 - 매개변수의 갯수가 다른 경우
    public static void main(String[] args) {
        System.out.println("1 : " + add(1,2));
        System.out.println("2 : " + add(1,2,3));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a + b + c;
    }
}
