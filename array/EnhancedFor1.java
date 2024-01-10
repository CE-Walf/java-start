package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문으로 출력
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문으로 출력
        for(int number : numbers){
            System.out.println(number);
        }
        // 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에, 코드가 간결하고 가독성이 좋다.
        // iter + Tab으로 향상된 for문의 틀을 만들 수 있음

        // 향상된 for문을 사용할 수 없는 경우 (index 값을 필요로 할 때 -> 증가하는 index 값이 감추어져 있기 때문에)
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
//        }
    }
}
