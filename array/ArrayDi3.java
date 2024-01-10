package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 선언과 동시에 초기화
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 2차원 배열의 길이를 활용 (.length)
        for (int row = 0; row < arr.length; row++){ // 행 탐색
            for (int column = 0; column < arr[row].length; column++){ // 열 탐색
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
