import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Integer.parseInt(br.readLine());
        long answer = getResult(input);
        bw.write(answer+"");
        br.close();
        bw.close();
    }

    private static long result = 1;
    private static long getResult(long input){
        if(input == 0){
            return 1;
        }else if(input==1){
            return result;
        }else {
            result *= input;
            return getResult(input-1);
        }
    }
}