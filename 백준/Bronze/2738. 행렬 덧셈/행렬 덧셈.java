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

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[i].length; j++){
                System.out.print(arr[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }


        br.close();
        bw.flush();
        bw.close();
        sc.close();
    }
}