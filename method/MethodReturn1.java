package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i){
        // 반환타입이 void가 아니므로, return이 존재해야함.
        // 짝수일때도 꼭 return을 정의해주어야 함. 하지 않으면 컴파일 오류
        if(i % 2 == 1){
            return true;
        } else {
            return false;
        }
    }
}
