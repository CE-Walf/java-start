package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자 나이

        // age는 20이므로 true, "성인입니다."가 출력이 된다.
        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18){
            System.out.println("미성년자입니다.");
        }
    }
}
