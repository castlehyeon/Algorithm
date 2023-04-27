import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        List<Integer> s2 = new ArrayList<>();
        List<Integer> s3 = new ArrayList<>();
//        String[] s = br.readLine().split(" ");


        int[] arr = new int[31];
        for(int i = 1; i < 29; i++){
            arr[Integer.parseInt(sc.nextLine())] = 1;
        }

        for(int i = 1; i<arr.length; i++){
            if(arr[i] != 1){
                System.out.println(i);
            }
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