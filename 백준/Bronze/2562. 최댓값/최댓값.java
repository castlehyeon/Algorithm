import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        List<Integer> s = new ArrayList<>();
        for(int i = 0; i<9; i++){
            int n = Integer.parseInt(br.readLine());
            if(n >=100)
                System.exit(0);
            s.add(n);
        }
        for(int i = 0; i<9; i++) {
            if (s.get(i) > max) {
                max = s.get(i);
                index = i+1;
            }
        }
        bw.write(max+"\n"+index);





        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}