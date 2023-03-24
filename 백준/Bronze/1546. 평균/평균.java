import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //과목수 입력
        int count = sc.nextInt();
        int[] arr = new int[count];

        //각 과목의 점수 입력
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //과목 중 최댓값 입력
        int max = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        //평균계산 로직
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
                sum+= arr[i];
            }

        double re = ((double)sum/max/count)*100;


        System.out.println(re);



    }
}
