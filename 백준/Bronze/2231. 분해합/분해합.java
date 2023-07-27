import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        getResult(input);

        if(list.size()>0){
            for(int n : list){
                bw.write(n+" ");
            }
        }else bw.write(0+"");

        br.close();
        bw.close();
    }

    private static List<Integer> list = new ArrayList<>();
    private static void getResult(int input){
        int sum = 0;
        int i = 1;
        while(i<input){
            String num = String.valueOf(i);
            String[] s = num.split("");
            sum = 0;
            for( int j = 0; j<s.length; j++){
                sum += Integer.parseInt(s[j]);
            }
            sum = sum + i;
            if( sum == input){
                list.add(i);
                break;
            }else i++;
        }
    }
}