import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (H>=0&&H<=24&&M>=0&&M<=59){
            int ABS = Math.abs(M - 45);

            if((M-45)<0) {
                M = 60 -ABS;
                H=H-1;
                if (H == -1 ){
                    H = 23;
                }
            }else if ((M-45)>=0){
                M = M - 45;
            }
            System.out.print(H+" ");
            System.out.print(M);
        }else System.out.println("다시 숫자를 입력하세요");

//

    }
}
