class Solution {
    public String solution(String my_string, String alp) {
        String result = "";
        char target = alp.charAt(0); 

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch == target) {
                result += Character.toUpperCase(ch); 
            } else {
                result += ch;
            }
        }
        return result;
    }
}


//다른 사람이 작성한 코드
class Solution {
    public String solution(String my_string, String alp) {
        String a = alp.toUpperCase();
        return my_string.replaceAll( alp, a);
    }
}

// alp를 대문자로 바꿔두고
//replaceAll함수를 사용해 my_string에서 alp문자를 a 즉 대문자로 교체해준다
