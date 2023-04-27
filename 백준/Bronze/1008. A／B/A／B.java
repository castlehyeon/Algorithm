import java.io.*;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");

        double a = Integer.parseInt(s[0]);
        double b = Integer.parseInt(s[1]);
        double rs = a/b;
        bw.write(rs+"");
        bw.close();


    }
}