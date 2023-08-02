import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if(input.equals("SONGDO")){
            bw.write("HIGHSCHOOL");
        } else if (input.equals("CODE")) {
            bw.write("MASTER");
        } else if (input.equals("2023")) {
            bw.write("0611");
        } else if (input.equals("ALGORITHM"))
            bw.write("CONTEST");
        br.close();
        bw.close();
    }
}