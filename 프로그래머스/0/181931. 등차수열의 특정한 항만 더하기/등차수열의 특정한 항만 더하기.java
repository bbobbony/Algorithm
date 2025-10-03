class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int term = 0;
        for(int i=0; i<included.length; i++){
            term = a+(d*i); //term에 i번째 등차수열 값 넣기
            if (included[i]) {//true니까 굳이 ==을 사용하지 않아도 적용됨
                answer += term;
            }
        }
        return answer;
    }
}