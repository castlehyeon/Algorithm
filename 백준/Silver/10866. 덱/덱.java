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
    private static Deque<Integer> deque = new ArrayDeque<>();

    private static int doCmd(String cmd, int input){
        int result = 0;
        if(cmd.equals("push_front")){
            deque.addFirst(input);
            result = -100;
        } else if(cmd.equals("push_back")){
            deque.addLast(input);
            result = -100;
        } else if (cmd.equals("pop_front")) {
            result = deque.size()==0 ? -1 : deque.removeFirst() ;
        } else if (cmd.equals("pop_back")) {
            result = deque.size()==0 ? -1 : deque.removeLast();
        } else if (cmd.equals("size")) {
            result = deque.size();
        } else if (cmd.equals("empty")) {
            result = deque.isEmpty() ? 1 : 0;
        } else if (cmd.equals("front")) {
            result = deque.size()!=0 ? deque.getFirst() : -1;
        } else if (cmd.equals("back")) {
            result = deque.size()!=0 ? deque.getLast() : -1;
        }
        return result;
    }
}
