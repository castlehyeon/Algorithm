import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String[] s = br.readLine().split(" ");
//
//        double a = Double.parseDouble(s[0]);
//        double b = Double.parseDouble(s[1]);
//        double c = Double.parseDouble(s[2]);
//        double rs = a+b+c;
//        bw.write(String.valueOf(rs));
//        bw.close();
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long rs = a + b + c;

        System.out.println(rs);

    }
}