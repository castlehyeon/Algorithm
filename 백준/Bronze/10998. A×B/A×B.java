import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
public static void main(String[]args) throws IOException {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Scanner br = new Scanner(System.in);
    int a = br.nextInt();
    int b = br.nextInt();

//
//
//    int count = 0;
//
//    //사용자 입력 문자 배열
//    String[] str = br.readLine().split("");
//    String[] strSum = new String[(str.length/2)+1]; //홀수개일 수도 있으니까. 두글자
//    String[] strSum3 = new String[(str.length/3)+1]; //세글자
//
//
//    //두문자씩 합치자
//    for(int i = 0; i<strSum.length; i++) {
//        if (count < str.length - 1) {
//            strSum[i] = str[count] + str[count + 1];
//            count += 2;
//        } else {
//            strSum[i] = str[count];
//        }
//    }
//
//    count = 0;
//    //세문자씩 합치자
//    for(int i = 0; i<strSum3.length; i++){
//        if(count<str.length-1){
//            strSum3[i] = str[count]+str[count+1]+str[count+2];
//            count += 2;
//        }else {
//            strSum3[i] = str[count];
//        }
//    }
//
//    //출력 문자 배열
//    String[] std = new String[] {"č", "ć", "dž","đ", "lj", "nj", "š", "ž"};
//
//    //비교 문자 배열
//    String[] ref = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
//
//
//    count = 0;
//    //비교 로직 2글자
//    for(int i = 0; i<strSum.length; i++){
//        for(int j = 0; j< ref.length; j++){
//            if(strSum[i].equals(ref[j])){
//                ++count;
//            }
//        }
//    }
//    //비교 로직 3글자
//    for(int i = 0; i<strSum3.length; i++){
//        for(int j = 0; j< ref.length; j++){
//            if(strSum3[i].equals(ref[j])){
//                ++count;
//            }
//        }
//    }

//    System.out.println(count);
System.out.print(a*b);
}
}