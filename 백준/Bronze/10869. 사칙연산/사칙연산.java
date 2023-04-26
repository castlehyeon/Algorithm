import java.io.*;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        bw.write(Integer.toString(a+b));
        bw.newLine();
        bw.write(Integer.toString(a-b));
        bw.newLine();
        bw.write(Integer.toString(a*b));
        bw.newLine();
        bw.write(Integer.toString(a/b));
        bw.newLine();
        bw.write(Integer.toString(a%b));
        bw.newLine();

        bw.flush();
        bw.close();

    }
}