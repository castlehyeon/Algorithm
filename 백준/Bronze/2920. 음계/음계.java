import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);


        String[] s = br.readLine().split(" ");
        int sum = 1;
        int stop = 0;
        for(int i = 0; i<s.length; i++){
            if(s[i].equals("1")&&stop==0){
                ++sum;
                stop = 1;


            } else if (s[i].equals("8")&&stop==0) {
                sum = 8;
                --sum;
                stop = -1;
            }

            if(stop==1&&s[i].equals(String.valueOf(sum))){
                ++sum;
            } else if (stop==-1&&s[i].equals(String.valueOf(sum))) {
                --sum;
            }
        }

        switch (sum){
            case 0 :
                bw.write("descending");
                break;
            case 9 :
                bw.write("ascending");
                break;
            default:
                bw.write("mixed");
                break;
        }




        br.close();
//        sc.close();
        bw.flush();
        bw.close();
    }
}