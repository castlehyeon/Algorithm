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

        for (int i = 0; i < testCase; i++) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            String[] priorities = br.readLine().split(" ");

            bw.write(getPrintOrder(n, m, priorities) + "\n");
        }

        br.close();
        bw.close();
    }

    private static int getPrintOrder(int n, int m, String[] priorities) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int priority = Integer.parseInt(priorities[i]);
            queue.offer(priority);
            priorityQueue.offer(priority);
        }

        int order = 1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int highestPriority = priorityQueue.peek();

            if (current < highestPriority) {
                queue.offer(current);
                if (m == 0) {
                    m = queue.size() - 1;
                } else {
                    m--;
                }
            } else {
                priorityQueue.poll();
                if (m == 0) {
                    return order;
                } else {
                    order++;
                    m--;
                }
            }
        }

        return -1; // 에러 처리 (실행되지 않아야 함)
    }
}
