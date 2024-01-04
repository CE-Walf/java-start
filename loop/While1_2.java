package loop;

public class While1_2 {
    public static void main(String[] args) {
        //While1_1의 내용을 while문을 사용하여 진행해보자.
        int count = 0;

        // count가 3미만일때 반복문 수행
        while(count < 3){
            count++;
            System.out.println("현재 숫자는:" + count);
        }
    }
}
