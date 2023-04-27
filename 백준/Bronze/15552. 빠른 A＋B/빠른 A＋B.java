import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());

        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < testcase; i++) {
            
            String[] s = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            sum.add(a + b);
        }
        for (int n : sum){
            bw.write(n+"\n");
        }

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
        bw.flush();
        bw.close();

    }
}