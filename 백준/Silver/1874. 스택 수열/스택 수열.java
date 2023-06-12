import java.io.*;

import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        //push, pop이 담긴 배열
        List<String> strings = new ArrayList<>();
        //사용자 입력 == 출력되어야할 결과값
        int[] intarr = new int[input];
        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = sc.nextInt();
        }
        //오름차순으로 정렬된 배열
        int[] sortedarr = new int[input];
        for (int i = 0; i < intarr.length; i++) {
            sortedarr[i] = i + 1;
        }

        Stack<Integer> stack = new Stack<>();

        int start = intarr[0];
        int num = 1;
        int index = 0;
        int max = 0;

        //스택에서 pop순서대로 담는 배열
        int[] stacknums = new int[input];
            for (; num <= start; num++) {
                stack.push(num);
                strings.add("+");
                max = num;
                ++index;
            }
        while (index > 0) {
            for (int i = 0; i < intarr.length; i++) {
                if (intarr[i] > max) {
                    stack.push(num);
                    strings.add("+");
                    max = num;
                    ++num;
                    ++index;
                    --i;
                } else if (max >= intarr[i]) {
                    stacknums[i] = stack.peek();
                    stack.pop();
                    strings.add("-");
                    --index;
                }
            }
        }

        //최종 비교
        for(int i = 0; i< intarr.length; i++){
            if(intarr[i]!=stacknums[i]){
                System.out.println("NO");
                strings.clear();
                break;
            }
        }

        for (String s : strings) {
            bw.write(s+"\n");
        }


        br.close();
        bw.close();

    }
}
