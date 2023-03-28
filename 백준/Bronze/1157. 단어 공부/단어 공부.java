import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자대로 자르기
        String[] arr = br.readLine().split("");

        for(int i = 0; i< arr.length; i++){
            if(arr[i].charAt(0)<=90){
                char ch = (char)(arr[i].charAt(0)+32);
                arr[i] = Character.toString(ch);
            }
        }
        //알파벳 숫자 배열
        int[] alphabet = new int[26];

        //알파벳 아스키코드 담기
        for (int i = 0; i< alphabet.length; i++){
            alphabet[i] = 97 + i;
        }

        //카운트 배열
        int[] count = new int[26];



        //arr요소가 알파뱃 배열과 같은지 비교.
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j< alphabet.length; j++){
                if(arr[i].charAt(0) ==alphabet[j]){
                    ++count[j];
                }
            }
        }

        //count배열에서 가장 큰 값 찾기
        int max = 0;
        String index = "";
        for(int i = 0; i< count.length; i++){
            if(count[i]>max){
                max = count[i];
                index = String.valueOf((char) alphabet[i]);
            } else if (max>0 && count[i]== max) {
                index = "?";
            }
        }
        System.out.print(index.toUpperCase());

    }
}
