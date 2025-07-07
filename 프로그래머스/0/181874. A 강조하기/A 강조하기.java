class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();      // 전체를 소문자로 변환
        return myString.replace("a", "A");      // 'a'만 'A'로 바꿈
    }
}
