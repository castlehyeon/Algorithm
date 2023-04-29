import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);


        int[] integers = new int[26];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<26; i++){
            integers[i] = 97+i;
            map.put(97+i, -1);
        }

        String[] s = br.readLine().split("");
        for(int i = 0; i<s.length; i++){
            for(int j = 0; j< integers.length; j++) {
                if (s[i].charAt(0) == integers[j] && map.get(97+j) == -1) {
                    map.put(97+j, i);
                }
            }
        }

        for(int n : map.keySet()){
            bw.write(map.get(n)+" ");
        }

        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}