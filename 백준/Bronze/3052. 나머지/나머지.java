import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);

        int[] integers = new int[10];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<10; i++){
            int n = Integer.parseInt(br.readLine());
            set.add(n%42);
        }
        bw.write(String.valueOf(set.size()));



        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}