import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int start = Integer.parseInt(s[0]);
        int end = Integer.parseInt(s[1]);

        List<Integer> resultList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (getPrime(i) == true) {
                resultList.add(i);
            }
        }

        for (int n : resultList) {
            bw.write(n + "\n");
        }


        br.close();
        bw.close();
    }

    private static boolean getPrime(int n) {
        boolean isPrime = true;
        if(n<2){
            return false;
        }
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
