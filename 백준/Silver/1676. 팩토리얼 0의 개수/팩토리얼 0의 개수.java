import java.io.*;

import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final long input = Long.parseLong(br.readLine());

        System.out.println(getResult(input));

        br.close();
        bw.close();

    }

    static int getResult(long input) {
        int count = 0;

        while (input >= 5) {
            count += input / 5;
            input /= 5;
        }
        return count;
    }
}
