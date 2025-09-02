class Solution {
    public String solution(String code) {
        int mode = 0; // 0으로 시작
        StringBuilder ret = new StringBuilder(); // 문자열 더할 때 StringBuilder 사용

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') { // mode 전환
                mode = 1 - mode;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    ret.append(c);
                } else if (mode == 1 && i % 2 == 1) {
                    ret.append(c);
                }
            }
        }

        // ret이 비어있으면 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();

        
//다른사람이 작성한 코드
class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0; //삼항연산자로 가독성 있게
                continue;
            }

            if (i % 2 == mode) { 
                answer.append(current);
            } 
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
    }
}
