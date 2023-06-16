import java.io.*;

import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        List<Integer> inputs = new ArrayList<>();
        String[] s = br.readLine().split(" ");
        for(int i = 0; i< s.length; ++i){
            inputs.add(Integer.parseInt(s[i]));
        }

        Collections.sort(inputs);

        for(int n : inputs){
            bw.write(n+" ");
        }
        br.close();
        bw.close();

    }
}
