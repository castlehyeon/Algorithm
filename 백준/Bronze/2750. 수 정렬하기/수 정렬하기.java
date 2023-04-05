import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        List nums = new ArrayList<Integer>();

        for(int i = 0; i<testCase; i++){
            nums.add(Integer.parseInt(br.readLine()));
        }

        nums = customSort(nums);

        for(Object n : nums){
            System.out.println(n);
        }
    }
    static List customSort(List li){
        int tmp;
        int min=0;
        for(int i = 0; i<li.size(); i++){
            //for문한번 전체 작은 값을 맨앞으로
            if((int)li.get(i)<(int)li.get(0)){
                min = (int)li.get(i);
                li.set(i,li.get(0));
                li.set(0,min);
            }

//for문 한번(앙옆으로)
                for(int j = 0; j < li.size(); j++){
                    if(j >= li.size()-1){

                    }else{
                    if(((int) li.get(j)) > (int)li.get(j+1)){
                        tmp = (int) li.get(j);
                        li.set(j, li.get(j+1));
                        li.set(j+1,tmp);
                    }

                }
                }


        }
        return li;
    }
}