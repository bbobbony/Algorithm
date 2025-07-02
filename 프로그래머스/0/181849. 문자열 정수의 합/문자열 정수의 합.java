class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {
            sum += num_str.charAt(i) - '0';  // 문자를 숫자로 변환/ 유니코드에서 0을 뺀것
        }
        return sum;
    }
}
