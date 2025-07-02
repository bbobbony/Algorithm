class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 1. 해야 할 일 개수 세기
        int count = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                count++;
            }
        }

        // 2. 정확한 크기의 정적 배열 생성
        String[] answer = new String[count];

        // 3. 다시 루프 돌며 answer 배열 채우기
        int index = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) { //false라면!!
                answer[index] = todo_list[i];
                index++;
            }
        }

        return answer;
    }
}

//다른 사람의 풀이
// finished가 false면 문자열에 todo_list값 담고 , 붙이고 split으로 다시 ,로 나눠서 배열반환
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str ="";
        for(int i=0; i< finished.length; i++){
            str = finished[i]==false ? str+todo_list[i]+"," : str;
        }
        return str.split(",");
    }
}
