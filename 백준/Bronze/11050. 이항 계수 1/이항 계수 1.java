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

        String[] s = br.readLine().split(" ");
        int input1 = Integer.parseInt(s[0]);
        int input2 = Integer.parseInt(s[1]);

        int answer = 1;

        if(input2!= 0 && input1 !=input2){
            int head = recursion(input1);
            result = 1;
            int down1 = recursion(input1-input2);
            result = 1;
            int down2 =recursion(input2);
            answer =head/(down1*down2);
        }

        bw.write(answer+"");


        br.close();
        bw.close();
    }

    private static int result = 1;
    private static int recursion(int input){
        result *= input;
       return input > 1 ? recursion(input-1) : result;
    }
}
