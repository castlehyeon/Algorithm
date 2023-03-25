import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        //문자열 입력하기.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        //BufferedReader 사용하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //나누기
        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());
        //런타임에러 해결하기: 공백 한개 입력하면 ArrayIndexOutOfBoundsException 에러. arr 배열이 초기화 되지 않음
//        String[] arr = new String[1];
                //공백으로 구분하기
//        arr = str.split(" ");
//      split을 쓰게 되면 공백이 첫글자일 때 에러가 생김.
//        int count = 0;
//
//        //만약 공백으로 시작하면 공백-1;
//        if (arr[0].equals("")){
//            count = 0;
//        }
//        else if(arr[0].equals("")||arr[arr.length-1].equals("")){
//            count = arr.length - 1;
//        }else
//                count = arr.length;


        //arr.length로 전체 단어 수 세기
//        System.out.println(count);


    }
}
