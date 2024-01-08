package casting;

public class Casting3 {
    public static void main(String[] args) {
        // 형변환을 할때, 만약 작은 숫자가 표현할 수 있는 범위를 넘어서면?

        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int)maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue); // 출력 : 2147483647

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue); // 출력 : -2147483648
        // 2147483648L는 int형에서 표현할 수 있는 방법이 없기에,
        // 처음부터 다시 시작해 int 범위의 가장 작은 숫자가 나오게 된다.  -> 오버플로우
        // 오버플로우 자체가 발생하지 않도록 사이즈를 늘려주자. ex) int -> long
    }
}
