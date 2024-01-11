package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18){
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // return을 만나면 바로 메서드를 탈출하게 된다.
        }
        System.out.println(age + "살, 입장하세요.");
    }
    // 반환값이 필요가 없을 경우, 받지 않고 그냥 메서드 호출만 해도 된다.
}
