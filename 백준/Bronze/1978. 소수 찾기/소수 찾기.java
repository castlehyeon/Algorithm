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

        int testCase = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        List<Integer> primeArr = new ArrayList<>();
        String[] s = br.readLine().split(" ");

        for(int i = 0; i<testCase; i++){
            arr.add(Integer.valueOf(s[i]));
        }

        getPrimeArr(arr, primeArr);

        bw.write(primeArr.size()+"");

        br.close();
        bw.close();
    }

    private static void getPrimeArr(List<Integer> arr, List<Integer> primeArr){
        for(int i = 0; i<arr.size(); i++){
            if(getPrime(arr.get(i))==true){
                primeArr.add(arr.get(i));
            }
        }
    }
    private static boolean getPrime(int n) {
        boolean isPrime = true;
        if(n<2){
            return false;
        }
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

}
