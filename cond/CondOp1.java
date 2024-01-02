// 삼항 연산자 활용
// 단순히 참과 거짓에 따라서 특정 값을 구하는경우, 삼항 연산자 또는 조건 연산자라고 불리는 ?: 연산자를 사용할 수 있다.
package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status;

        if (age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }

        System.out.println("age = " + age + ", status = " + status);

    }
}
