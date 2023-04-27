import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        List<Integer> s2 = new ArrayList<>();
        List<Integer> s3 = new ArrayList<>();
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

//        s = null;
        s = br.readLine().split(" ");
        for(int i = 0; i < a; i++){
            s2.add(Integer.parseInt(s[i]));
        }

        for(int n : s2){
            if(n<b){
                s3.add(n);
            }
        }
        for(int n : s3){
            bw.write(n+" ");
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