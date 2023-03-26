import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        //문자열 입력하기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스 개수입력
        int count = Integer.parseInt(br.readLine());

        //테스트 케이스만큼 for문 돌리기
        for(int a = 0; a<count; a++) {

            // 반복횟수 및 문자열 전부 스트링 배열로 받아서 첫째 요소만 int로 형변환하기
            String[] arr = br.readLine().split(" ");


            int repeat = Integer.parseInt(arr[0]);
            String s = arr[1];

            //반복 문자열 출력
            //반복되는 횟수 만큼 각 문자 출력
            for(int i = 0; i < s.length(); i++) { //// .length()는 문자열 길이 리턴

                for (int j = 0; j < repeat; j++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }



    }
}
