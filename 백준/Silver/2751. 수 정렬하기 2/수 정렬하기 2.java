
import java.io.*;

import java.util.*;

class Main {
    //int[] arr은 정렬할 배열.
    static int[] integers;

   private static void mergeSort(int[] arr, int start, int end){
       if (start < end) {
           int mid = (start + end) / 2;
           //반으로 나누기
           mergeSort(arr, start, mid);
           mergeSort(arr, mid+1, end);
           //병합하기
           merge(arr, start, mid, end);
       }
   }
   private static void merge(int[] arr, int start, int mid, int end){
       //병합하려는 두개의 방 중 첫번째 방의 시작점
       int part1 = start;
       //병합하려는 두개의 방 중 두번째 방의 시작점
       int part2 = mid + 1;
       //병합한 결과를 담는 배열의 시작점
       int index = start;
       //첫번째 배열이 끝까지 가거나 두번째 배열이 끝까지 갈때까지
       while(part1 <= mid && part2 <= end){
           //두개 배열중 첫번째 값이 작을 때
           if(arr[part1] <= arr[part2]){
               // 코드를 더 줄일 수 있음.
//               //정렬할 배열에 첫번째 비교 배열의 값을 복사
//               integers[index] = arr [part1];
//               //다음 인덱스로 넘김
//               part1++;

               //정렬할 배열에 첫번째 비교 배열의 값을 복사
               integers[index] = arr[part1++];
           }else {
               //그렇지 않다면 두번째 배열을...
               integers[index] = arr[part2++];
           }
           //작업이 끝나면 정렬할 배열의 인덱스 값을 증가
           index++;
       }
       //한쪽이 데이터가 남을 경우, 나머지 데이터를 정렬할 배열에 붙여주는 작업
       //뒤쪽 배열은 최종배열에서의 뒤쪽이기 때문에 신경쓰지 않아도 된다.
       if (part1 > mid) {
           for (int i = part2; i <= end; i++, index++) {
               integers[index] = arr[i];
           }
       } else {
           for (int i = part1; i <= mid; i++, index++) {
               integers[index] = arr[i];
           }
       }

       for (int i = start; i <= end; i++) {
           arr[i] = integers[i];
       }
   }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        integers = new int[testCase];

        //정렬할 배열 생성
        for(int i = 0; i<testCase; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //병합정렬 로직
        mergeSort(arr, 0, arr.length-1);

        //결과 프린트
        for (int n : arr) {
            bw.write(n + "\n");
        }

        br.close();
        bw.close();
    }
}