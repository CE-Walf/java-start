package method;

public class Overloading2 {
    // 메서드 오버로딩 - 매개변수 타입이 다른 경우 1.
    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,1);
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, double b){
        System.out.println("double a, int b");
    }
}
