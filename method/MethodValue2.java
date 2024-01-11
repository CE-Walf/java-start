// 중요!
// 자바는 항상 변수의 값을 복사해서 대입한다.
package method;

public class MethodValue2 {

    public static void main(String[] args) {
        // 변수명이 같아도 달라지는 것은 없다.
        int number = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + number); // 출력 : 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, num1 : " + number); // 출력 : 5
    }

    public static void changeNumber(int number){ // num1의 값을 복사해서 num2에 전달
        System.out.println("2. changeNumber 변경 전, num2 : " + number); // 출력 : 5
        number = number * 2; // 그러므로, num2의 변경은, num1에 영향을 주지 않는다.
        System.out.println("3. changeNumber 변경 후, num2 : " + number); // 출력 = 5
    }
}
