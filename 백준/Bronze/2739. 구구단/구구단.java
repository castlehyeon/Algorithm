import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
//        List<Integer> s2 = new ArrayList<>();
//        List<Integer> s3 = new ArrayList<>();
//        String[] s = br.readLine().split(" ");

        int a = sc.nextInt();
        for(int i = 1; i<10; i++){
            System.out.println(a + " * " + i +" = " + (a*i));
        }

//        br.close();
        bw.flush();
        bw.close();
    }
}