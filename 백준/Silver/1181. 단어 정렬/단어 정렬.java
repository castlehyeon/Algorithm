import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        //treeSet은 객체의 정렬을 지원
        //comparable과 comparator의 차이. 전자: 기본 정렬 기준 재정의 후자 : 객체마다 정렬기준 정의
        //리스트 객체 -> set으로 변환 (공부를 위해)
        //TreeSet은 문자열 길이가 갖다면 중복으로 생각해 삭제가 되어버림.
        //set 객체를 comparator로 size, length로 길이 비교 메서드 생성


        List<String> words = new ArrayList<>();
        //사실 테스트케이스 숫자는 필요없다.
        int caseNum = Integer.parseInt(br.readLine());
        //.readLine은 개행문자인 \n은 읽지 않기 때문에 split을 쓸 수 없다.
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()){
            words.add(input);
        }

        Set set = getOrderedTreeSet(words);

        //set을 iterator로 출력해보기.
        //set을 iterator안에 담기.
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            bw.write(iter.next()+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
    //Arrays.sort()는 배열을 정렬하는 메소드, set은 Set 인터페이스를 구현하는 객체이므로, Arrays.sort() 메소드의 인자로 사용될 수 없음.
    //중복이 없었더라면 List의 상태로도 Comparator를 사용해서 정렬해도 괜찮았음.
    private static Set getOrderedTreeSet(List list){
        //compartingInt : Comparator를 사용하는 문자열의 길이 비교 메소드
        //TreeSet은 정렬하지 않은 Set과 다르게 오름차순으로 정렬해서 값을 가지고 있다.
        //Set의 종류 참고: https://wakestand.tistory.com/111

        //Comparator 인터페이스 구현체 정의
        Comparator<String> comparator = (o1, o2) -> {
            //o1과 o2는 비교하고자 하는 두 객체를 의미.
            // Comparator 인터페이스를 구현할 때, compare 메소드의 파라미터로 들어오는 첫번째 인자는 기준이 되는 객체(o1), 두번째 인자는 비교할 객체(o2)
            // o1과 o2를 이용하여 두 객체를 비교하고 비교 결과를 반환
            // 이때 반환값은 음수, 양수, 0 중 하나이며, 음수이면 o1이 o2보다 작은 것으로 판단하고, 양수이면 o1이 o2보다 큰 것으로 판단하며, 0이면 두 객체가 같다고 판단.

            //comparator 람다식 작성
            if(o1.length() != o2.length()){
                //Comparator에서 return o1.length() - o2.length();는 빼기 연산을 의미하지 않는다.
                //이 연산은 비교 결과를 나타내는 것.
                // Comparator의 compare 메서드는 두 개의 객체를 비교하고, 첫 번째 객체(o1)가 두 번째 객체(o2)보다 작으면 음수를, 같으면 0을, 크면 양수를 반환.
                //따라서 return o1.length() - o2.length();은 첫 번째 객체의 문자열 길이가 두 번째 객체의 문자열 길이보다 작으면 음수를, 같으면 0을, 크면 양수를 반환하는 비교 결과를 반환하는 것입니다.
                // 이 비교 결과를 바탕으로 Comparator는 정렬을 수행하게 됩니다.
                return o1.length() - o2.length();
            }else
                return o1.compareTo(o2);
        };

        //SortedSet은 Java Collection Framework에 포함된 인터페이스. TreeSet을 통해 구현
        SortedSet<String> ss = new TreeSet<>(comparator);
        ss.addAll(list);

//        LinkedHashSet은 입력순서를 유지하면서 중복을 제거하는 방법. 이 문제와는 맞지 않다.
//        return new LinkedHashSet<>(list);

        return ss;
    }// End of getOrderdTreeSet
} // End of class

