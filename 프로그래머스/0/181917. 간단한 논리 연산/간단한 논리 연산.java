class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean first_or = x1 || x2;
        boolean second_or = x3 || x4;
        boolean answer = first_or && second_or;
        return answer;
    }
}