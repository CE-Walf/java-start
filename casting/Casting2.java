package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 반대로, 큰 범위에서 작은범위로 대입해보자.
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue // 컴파일 오류 발생 (형변환 불가)
        intValue = (int) doubleValue; // 오류 발생 X, 명시적 형변환
        System.out.println(intValue); // 출력 : 1 (1.5에서 1만 나옴)

        // 소숫점을 버리고 정수로만 보고싶을때 형변환 사용.
        System.out.println((int)10.5); // 출력 : 10
    }
}
