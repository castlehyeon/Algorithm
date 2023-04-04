//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class Main {
//    public static void main(String[]args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int count = 0;
//        //사용자 입력 문자 배열
//        String[] str = br.readLine().split("");
//
//        //문자를 하나씩 추가해 계속 비교함
//        String compare = "";
//        //비교 문자 배열
//        String[] ref = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=", "e", "a", "k"};
//
//        //카운트 로직
//        for(int i = 0; i < str.length; i++){
//            compare+=str[i];
//            for(int j = 0; j< ref.length; j++){
//                if(compare.contains(ref[j])){
//                    compare = compare.replaceAll(ref[j],"*");
//                    ++count;
//                }
//            }
//        }
//
//
//        System.out.println(count);
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // ljes=njak
        String str = sc.next();
        System.out.println(solution(str));
    }
    public static int solution(String str) {
        String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String s : croAlpha)
            if(str.contains(s)) str = str.replaceAll(s, "*");
        return str.length();
    }
}