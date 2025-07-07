class Solution {
    public int solution(String number) {
        //1. number를 정수형으로 변환 -> 각자리수 합
        //2. sum % 9 
        
        int sum = number.chars().map(c -> c-'0').sum();
        int answer = sum % 9;
        return answer;
    }
}