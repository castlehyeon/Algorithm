import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
//        int b = Integer.parseInt(s[1]);
        if(a>=90&&a<=100){
            bw.write("A");
        } else if (a<=89&&a>=80) {
            bw.write("B");
        }else if (a<=79&&a>=70) {
            bw.write("C");
        }else if (a<=69&&a>=60) {
            bw.write("D");
        }else {
            bw.write("F");
        }
        bw.flush();
        bw.close();

    }
}