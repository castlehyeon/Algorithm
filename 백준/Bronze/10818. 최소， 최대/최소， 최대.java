import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1000000;
        int min = 1000000;

        for( int i = 0; i <arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.printf("%d %d", min, max);





    }
}
//첫번째 숫자는 두번째, 세번째, 네번째 ,다섯번째 숫자와 비교
//중간에 자기보다 크면 스위치
//다시 처음부터 비교
//중간에 자기보다 크면 스위치
//전부다 비교했는데 본인이 제일크다?
//그럼 두번째부터 끝까지.
