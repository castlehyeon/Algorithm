import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Matrix implements Comparable<Matrix>{

    int x;
    int y;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Matrix o) {
        if(this.x != o.x) {
            return this.x - o.x;
        }else return this.y - o.y;

    }

    @Override
    public String toString() {
        return x +
                " " + y;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Matrix> priorityQueue = new PriorityQueue<>();
        int testcase = Integer.parseInt(br.readLine());

        for( int i = 0; i< testcase; i++){
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            Matrix matrix = new Matrix(x, y);
            priorityQueue.add(matrix);
        }

        while (!priorityQueue.isEmpty()) {
            bw.write(priorityQueue.poll() + "\n");
        }

        br.close();
        bw.close();
    }
}
