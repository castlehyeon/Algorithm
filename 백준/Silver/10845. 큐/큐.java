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
    private static Queue<Integer> queue = new LinkedList<>();

    private static int last = 0;

    private static int doCmd(String cmd, int input){
        int result = 0;
        if(cmd.equals("push")){
            queue.add(input);
            last = input;
            result = -100;
        } else if (cmd.equals("front")) {
            result = queue.size()==0 ? -1 : queue.peek() ;
        } else if (cmd.equals("back")) {
            result = queue.size()==0 ? -1 : last;
        } else if (cmd.equals("size")) {
            result = queue.size();
        } else if (cmd.equals("empty")) {
            result = queue.isEmpty() ? 1 : 0;
        } else if (cmd.equals("pop")) {
            result = queue.size()!=0 ? queue.poll() : -1;
        }
        return result;
    }
}
