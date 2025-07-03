class Solution {
    public int solution(int a, int b) {
        
        
        //1. 두가지 수로 특별한 연산하기
        String special = Integer.toString(a) + Integer.toString(b);
        
        //2. 두가지 수로 2*a*b 연산하기
        int normal = 2 * a * b;
        
        return Integer.parseInt(special) >= normal ? Integer.parseInt(special) : normal ;
    }
}


//다른사람의 인상깊은 코드 메모해두기
class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a + "" + b);
        if(2 * a * b <= ab) {
            return ab;
        } else {
            return 2 * a * b;
        }
    }
}
