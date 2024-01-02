package cond;

public class If2 {
    public static void main(String[] args) {
        int age = 20; // 사용자의 나이

        // 나이가 18세 이상이면 "성인입니다."
        // 나이가 18세 미만이면 "미성년자입니다." 출력
        if (age >= 18){
            System.out.println("성인입니다."); // 참 일때
        } else {
            System.out.println("미성년자입니다."); // 만족하는 조건이 없을 때 (거짓 일때)
        }

    }
}
