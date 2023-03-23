import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int[] arr = new int[basket];

        for(int i = 1; i<= arr.length; i++){
            arr[i-1] = i;
        }

        int count = sc.nextInt();

        for(int i = 0; i<count; i++ ) {
            int fir = sc.nextInt()-1;
            int sec = sc.nextInt()-1;
            int sw = arr[sec];
            arr[sec] = arr[fir];
            arr[fir] = sw;

        }

        for(int i = 0; i<arr.length; i++){
            System.out. printf(arr[i]+ " ");
        }



//        for (int i = 0; i<count; i++){
//            int fir = (int)(Math.random()*10);// 0-9
//            int sec = (int)(Math.random()*10);// 0-9
//            int sw = 0;
//
//            if(fir-count<=0){
//                fir = Math.abs(fir-count);
//            }else if( sec-count<=0){
//                sec = Math.abs(sec-count);
//            }
//
//            if (fir>sec){
//                sw = sec;
//                sec = fir;
//                fir = sw;
//            }
//
//            System.out.println(arr[fir]+ " "+ arr[sec]);
//            sw = arr[sec];
//            arr[sec] = arr[fir];
//            arr[fir] = sw;
//        }


    }
}
//1,3,5
//2,4,6