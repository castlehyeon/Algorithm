import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.List.of;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isgoing = true;

        while (isgoing){
            String[] s = br.readLine().split(" ");
            input1 = Integer.parseInt(s[0]);
            input2 = Integer.parseInt(s[1]);
            input3 = Integer.parseInt(s[2]);

            if(isStop())
                break;

            String result = isCorrect() ? "right\n" : "wrong\n";

            bw.write(result);
        }

        br.close();
        bw.close();
    }

    private static int input1 =-1;
    private static int input2 =-1;
    private static int input3 =-1;

    private static List<Integer> inputList = new ArrayList<>();
    private static boolean isStop(){
        boolean isStop = false;
        if( input1 + input2 + input3 == 0){
            isStop = true;
        }

        return isStop;
    }

    private static boolean isCorrect(){
        if(inputList.size()!= 0){
            inputList.clear();
        }
        inputList.add(input1);
        inputList.add(input2);
        inputList.add(input3);

        boolean isCorrect= false;
        int max = Collections.max(inputList);
        int sum = 0;
        for(int n : inputList){
            if(max != n){
                sum += Math.pow((double) n, 2);
            }
        }
        if(Math.pow((double) max,2)==sum){
            isCorrect = true;
        }
        return isCorrect;
    }
}
