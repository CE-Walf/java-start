package method;

public class Method1Ref {
    public static void main(String[] args){
        // 계산 1
        int sum1 = add(5, 10); // 메서드 호출
        System.out.println("결과1 출력 : " + sum1);

        // 계산 2
        int sum2 = add(15, 20); // 메서드 호출
        System.out.println("결과2 출력 : " + sum2);
    }

    // add method를 작성해주자.
    public static int add(int a, int b) {
        // public : 다른 클래스에서 호출할 수 있는 메서드
        // static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum; // 반환값 sum(a+b)
    }
}
