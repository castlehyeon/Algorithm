import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        //문자열 입력하기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;


            //스트링 배열로 받기.
            String[] arr = br.readLine().split(" ");
            int num = 0;
            String s = arr[0];

            for(int i = 0; i<s.length(); i++){

                char ch = s.charAt(i);
                //if문으로 분기하기
                if (ch == 'A'|| ch == 'B'|| ch == 'C'){
                    num = 2;
                } else if (ch == 'D'|| ch == 'E'|| ch == 'F') {
                    num= 3;
                } else if (ch == 'G'|| ch == 'H'|| ch == 'I') {
                    num= 4;
                } else if (ch == 'J'|| ch == 'K'|| ch == 'L') {
                    num = 5;
                } else if (ch == 'M'|| ch == 'N'|| ch == 'O') {
                    num = 6;
                } else if (ch == 'P'|| ch == 'Q'|| ch == 'R' || ch == 'S') {
                    num = 7;
                } else if (ch == 'T'|| ch == 'U'|| ch == 'V') {
                    num = 8;
                } else if (ch == 'W'|| ch == 'X'|| ch == 'Y' || ch == 'Z') {
                    num = 9;
                }
                //걸리는 시간은 +1초임.
                ++num;

                //전체 시간 계산
                sum += num;

            }

            //전체시간
        System.out.println(sum);
    }
}
