import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
//        List<Integer> s2 = new ArrayList<>();
//        List<Integer> s3 = new ArrayList<>();
//        String[] s = br.readLine().split(" ");


            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(((a+b)*(a-b)));


//        br.close();
        sc.close();
//        bw.flush();
//        bw.close();
    }
}