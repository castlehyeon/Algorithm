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
        List<String> s = new ArrayList<>();
        for(int i = 0; i<testcase; i++){
            s.add(br.readLine());
        }
        for(int i = 0; i<s.size(); i++){
            bw.write(s.get(i).charAt(0));
            bw.write(s.get(i).charAt(s.get(i).length()-1));
            bw.write("\n");
        }




        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}