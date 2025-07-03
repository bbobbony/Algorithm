class Solution {
    public int solution(int a, int b) {
        
        
        //1. 두가지 수로 특별한 연산하기
        String special = Integer.toString(a) + Integer.toString(b);
        
        //2. 두가지 수로 2*a*b 연산하기
        int normal = 2 * a * b;
        
        return Integer.parseInt(special) > normal ? Integer.parseInt(special) : normal ;
    }
}