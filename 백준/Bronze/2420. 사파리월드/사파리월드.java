import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");

        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);

//        if(a%4==0&&a%100!=0||a%400==0){
//            bw.write("1");
//        } else if (a<0&&b>0) {
//            bw.write("2");
//        }else if (a>0&&b<0) {
//            bw.write("4");
//        }else if (a>0&&b>0) {
//            bw.write("1");
//        }else {
//            bw.write("0");
//        }
        bw.write(String.valueOf(Math.abs(a-b)));
        bw.flush();
        bw.close();

    }
}