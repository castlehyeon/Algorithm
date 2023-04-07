
import java.io.IOException;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int nums = sc.nextInt();

        //방법 1 내림차순 정렬
        Integer arr[] = new Integer[testCase];

        for(int i = 0; i< testCase; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(arr[nums-1]);
    }
}