package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        // m이 0보다 크면, m의 두배 값을 temp로 알려주는
        if (m > 0){
            // temp는 if문 안에서 사용되지 굳이 main 블록에 사용할 필요가 없다. 이렇게 할 시,
            // 1. 생존 범위가 넓어짐에 따른 비효율적인 메모리 사용
            // 2. 코드 복잡성이 증가된다. -> temp를 if 코드블럭에 선언했을 경우, if문이 끝난 이후에는, temp에 대한 생각을 안해도 됨.
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = "+ m);

    }
}
