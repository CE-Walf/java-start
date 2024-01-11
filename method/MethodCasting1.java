package method;

public class MethodCasting1 {
    // 메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않다면 어떻게 해야할까?
    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); // double을 int에 대입하므로 컴파일 오류가 발생한다.
        printNumber((int) number); // 그러므로, 명시적 형변환을 사용하여 double을 int로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
