import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);


        int  input = Integer.parseInt(br.readLine());
        for(int i = 0; i<input; i++){
            bw.write(input-i+"\n");
        }


        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}