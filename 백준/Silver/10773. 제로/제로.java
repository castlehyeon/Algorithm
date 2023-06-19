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

        int testCase = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i<testCase; i++){
            arr.add(Integer.valueOf(br.readLine()));
        }


        Stack<Integer> stack = new Stack<>();//push, pop, peek, empty, seach 지원
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == 0){
                stack.pop();
            }else
            stack.push(arr.get(i));
        }
        int sum = 0;
        for(int i = 0; i< stack.size(); i++){
            sum+=stack.get(i);
        }
        bw.write(sum+"");


        br.close();
        bw.close();
    }


}
