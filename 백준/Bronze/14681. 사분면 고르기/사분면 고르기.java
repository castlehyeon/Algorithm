import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if(a<0&&b<0){
            bw.write("3");
        } else if (a<0&&b>0) {
            bw.write("2");
        }else if (a>0&&b<0) {
            bw.write("4");
        }else if (a>0&&b>0) {
            bw.write("1");
        }
        bw.flush();
        bw.close();

    }
}