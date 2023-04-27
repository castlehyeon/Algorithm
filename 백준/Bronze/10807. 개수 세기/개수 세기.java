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
        List<Integer> s2 = new ArrayList<>();
        List<Integer> s3 = new ArrayList<>();
        String[] s = br.readLine().split(" ");
        int ref = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase; i++){
            s2.add(Integer.parseInt(s[i]));
        }

        for(int n : s2){
            if(n==ref){
                s3.add(n);
            }
        }
        
        bw.write(String.valueOf(s3.size()));

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