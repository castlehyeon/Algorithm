import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);

        int[] input = new int[3];
        int[] decimal = new int[10];

        for(int i = 0; i< input.length; i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        int result = input[0]*input[1]*input[2];
        String[] s = String.valueOf(result).split("");

        for(int i = 0; i<s.length; i++){
            for(int j = 0; j<10; j++){
                if(s[i].equals(String.valueOf(j))){
                    decimal[j] += 1;
                }
            }
        }

        for(int d : decimal){
            bw.write(d+"\n");
        }







        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}