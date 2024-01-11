package method;

public class MethodCasting2 {
    // 메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않다면 어떻게 해야할까?
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int에서 double로 자동으로 형변환.
    }

    public static void printNumber(double n) { //  double형 파라미터에 int형 인수의 전달은 가능.
        System.out.println("숫자 : " + n);
    }
    // 메서드를 호출할 때, 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
    // 허나, 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.
}
