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

        int testcase = Integer.parseInt(br.readLine());

        for(int i = 0; i<testcase; i++){
            arr.add(br.readLine());
        }

        for(int i = 0; i<testcase; i++){
            String[] s = arr.get(i).split(" ");
            String cmd = s[0];
            int input = 0;
            if( s.length > 1) {
                input = Integer.parseInt(s[1]);
            }
            int result = doCmd(cmd, input);
            if(result>-100) {
                bw.write(result+"\n");
            }
        }

        br.close();
        bw.close();
    }

    private static List<String> arr = new ArrayList<>();
    private static Stack<Integer> stack = new Stack<>();

    private static int doCmd(String cmd, int input){
        int result = 0;
        if(cmd.equals("push")){
            stack.push(input);
            result = -100;
        } else if (cmd.equals("pop")) {
            result = stack.size()==0 ? -1 : stack.pop() ;
        } else if (cmd.equals("size")) {
            result = stack.size();
        } else if (cmd.equals("empty")) {
            result = stack.empty() ? 1 : 0;
        } else if (cmd.equals("top")) {
            result = stack.size()!=0 ? stack.peek() : -1;
        }
        return result;
    }
}
