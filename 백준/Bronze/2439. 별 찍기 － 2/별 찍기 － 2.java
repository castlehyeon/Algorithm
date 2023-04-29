import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);

        int testcase = Integer.parseInt(br.readLine());
        String[] s = new String[testcase];
        for(int i = 0; i<testcase; i++){
            int index = testcase-1-i;
            for(int j = s.length-1; j > index-1; j--){
                s[j] = "*";
            }
            for(int j = index-1; j > -1; j--){
                s[j] = " ";
            }
            for(String st : s){
                bw.write(st);
            }
            bw.write("\n");
        }




        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}