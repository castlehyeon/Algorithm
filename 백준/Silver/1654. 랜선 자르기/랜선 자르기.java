import java.io.*;

import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        List<Integer> arrN = new ArrayList<>();
        final int N;
        final int K;

        String[] s = br.readLine().split(" ");
        //현재 입력한 선의 개수
        K = Integer.parseInt(s[0]);
        //필요한 선의 개수
        N = Integer.parseInt(s[1]);

        for (int i = 0; i < K; i++) {
            arrN.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(arrN);

        long lo = 1;
        long hi = arrN.get(arrN.size()-1);
        long mid = 0;

//        int[] results = new int[K];

        while (lo <= hi){
            mid = (lo+hi)/2;
            long sum = 0;
            sum = getResultSum(arrN, sum, mid);
            //원하는 개수보다 많을 때
            if(sum >= N){
                lo = mid+1;
            } else if (sum < N) {
                hi = mid -1;
            }
        }


        bw.write(hi+"");
        br.close();
        bw.close();

    }

    static long getResultSum(List<Integer> arrN, long sum, long mid) {
        for (int n : arrN) {
            sum += n/mid;
        }
        return sum;
    }
}
//이분탐색
//1. lo, mid, hi 세개의 값으로 찾는다.
//2. while문은 lo가 hi와 값이 같아질 때까지 반복한다.
//3. 몫의 합이 로직의 핵심이다. 이때 자료형은 long형이다.
//4. 몫의 합이 입력한 값보다 크거나 같다면, low에 mid+1, 몫의 합이 입력한 값보다 작다면 hi에 mid-1이다. (이분 탐색)
//5. 이때 최대값을 구해야함으로 hi를 출력한다.
