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
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        getQueue(N);

        getResult(M);

        bw.write("<");
        for(int i = 0; i<list.size(); i++){
            if(i<list.size()-1){
                bw.write(list.get(i)+", ");
            }else{
                bw.write(list.get(i)+">");
            }

        }
        br.close();
        bw.close();
    }

    private static Queue<Integer> queue = new LinkedList<>();
    private static List<Integer> list = new ArrayList<>();

    private static void getQueue(int N) {
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
    }

    private static void getResult(int M) {
        while(queue.size() > 1){
            for(int i = 0; i< M - 1; i++){
                queue.offer(queue.poll());
            }
            list.add(queue.poll());
        }
        list.add(queue.poll());
    }
}