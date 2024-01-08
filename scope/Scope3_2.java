package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m > 0){ // temp의 Scope는 if문의 범위
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        //System.out.println(temp); // temp 접근시 오류
        System.out.println("m = "+ m);

        // while문과 for문에서의 i의 Scope에 대해서도 생각해볼 수 있다.
        // 카운터 변수가 있다면 while문 보다, for문을 사용해서 스코프의 범위를 제한하는 것이 사용과 유지보수 관점에서 좋다.
    }
}
/*
메모리를 효율적으로 사용하고, 더 유지보수하기 좋은 코드를 만들기 위해,
변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다.
*/