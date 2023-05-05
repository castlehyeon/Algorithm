import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        String[] matrix = new String[row];
        int sol = Integer.MAX_VALUE;
        //사용자 입력값 받기
        //한줄씩
        for(int i=0; i<row; i++) {
            matrix[i] = br.readLine();
        }


        //좌표값 i.j
        //8*8이라면 시작 좌표값이 0,0으로 고정
        //그 이상이라면...
        for( int i = 0; i<=row - 8; i++){
            for(int j=0; j<=col - 8; j++) {
                int curSol = solved(i, j, matrix);

                //최솟값 저장
                if(sol > curSol) {
                    sol = curSol;
                }
            }
        }

        System.out.println(sol);
        br.close();
        bw.flush();
        bw.close();
    }

    private static int solved(int start_row, int start_col, String[] matrix) {
        //8*8 체스판은 두종류다.
        //하얀색으로 시작하는 체스판.
        String orgMatrix[] = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;

        for(int i=0; i<8; i++) {
            //row와 col는 시작좌표부터 7을 더할 때까지다.
            int row = start_row + i;
            for(int j=0; j<8; j++) {
                int col = start_col + j;

                //현재 좌표의 값 (해당 행*각 case에 해당하는 열 값)
                //orgMatrix는 0부터 시작이 고정이라 j를 넣는다.
                if(matrix[row].charAt(col) != orgMatrix[row % 2].charAt(j)) {
                    whiteSol++;
                }
            }
        }
        
        //만약 검은색으로 시작하는 체스판이라면 64개 전부 다시 칠해야한다.
        //하지만 칠할 필요 없는 0이다. 즉 whiteSol이 64라면 0을 출력하게 한다.
        return Math.min(whiteSol, 64-whiteSol);
    }// End of solved
} // End of class
