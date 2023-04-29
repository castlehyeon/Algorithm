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
        int sum = 0;
        String[] s = br.readLine().split("");
        int[] ints = new int[testcase];

        for(int i = 0; i< ints.length; i++){
            ints[i] = Integer.parseInt(s[i]);
        }
        for(int i = 0; i<ints.length; i++){
            sum+=ints[i];
        }
        bw.write(sum+"");


        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}