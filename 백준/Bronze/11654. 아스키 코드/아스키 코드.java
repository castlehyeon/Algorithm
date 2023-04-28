import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
//        List<Integer> s2 = new ArrayList<>();
//        List<Integer> s3 = new ArrayList<>();

        char c = br.readLine().charAt(0);

        System.out.println((int)c);


//        br.close();
        sc.close();
//        bw.flush();
//        bw.close();
    }
}