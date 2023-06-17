import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Set<Integer> setN = getSet(s);

        int M = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        Set<Integer> setM = getSet(s2);

        Set<Integer> resultSet = getResult(setN, setM);

        for (int i = 0; i < M; i++) {
            int result = resultSet.contains(Integer.parseInt(s2[i])) ? 1 : 0;
            bw.write(result + "\n");
        }

        br.close();
        bw.close();
    }

    private static Set<Integer> getSet(String[] s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            set.add(Integer.parseInt(s[i]));
        }
        return set;
    }

    private static Set<Integer> getResult(Set<Integer> setN, Set<Integer> setM) {
        Set<Integer> resultSet = new HashSet<>();

        for (int element : setM) {
            if (setN.contains(element)) {
                resultSet.add(element);
            }
        }

        return resultSet;
    }
}