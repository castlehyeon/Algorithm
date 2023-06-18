import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        List<Integer> HList = new ArrayList<>();
        List<Integer> WList = new ArrayList<>();
        List<Integer> NList = new ArrayList<>();

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            String[] s = br.readLine().split(" ");
            HList.add(Integer.valueOf(s[0]));
            WList.add(Integer.valueOf(s[1]));
            NList.add(Integer.valueOf(s[2]));
        }

        for (int i = 0; i < testCase; i++) {
            resultList.add(getRoomNum(HList.get(i), WList.get(i), NList.get(i)));
        }

        for (String s : resultList) {
            bw.write(s + "\n");
        }

        br.close();
        bw.close();
    }

    private static String getRoomNum(int H, int W, int N) {
        int startH = 1;
        int startW = 1;

        for (int i = 1; i < N; i++) {
            if (startH < H) {
                ++startH;
            } else if (startH == H) {
                startH = 1;
                ++startW;
            }
        }

        String WChangeString;
        if (startW < 10) {
            WChangeString = "0" + String.valueOf(startW);
        } else {
            WChangeString = String.valueOf(startW);
        }
        String result = String.valueOf(startH) + WChangeString;

        return result;
    }
}
