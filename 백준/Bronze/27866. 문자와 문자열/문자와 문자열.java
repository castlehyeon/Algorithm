import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        List<Integer> s2 = new ArrayList<>();
//        List<Integer> s3 = new ArrayList<>();


        String[] s = br.readLine().split("");
        int a = Integer.parseInt(br.readLine());
        bw.write(s[a-1]);


        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}