package method;

public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5;
        // 중요!
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        int num2 = num1; // num1 = 5, num2 = 5 -> num1에 들어있는 값을 읽고 복사해서 num2에 넣는다.
        num2 = 10; // num1 = 5, num2 = 10

        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
