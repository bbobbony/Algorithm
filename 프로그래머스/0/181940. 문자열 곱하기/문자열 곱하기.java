class Solution {
    public String solution(String my_string, int k) {
        String empty ="";
        for(int i=0; i<k; i++){
            empty += my_string;
        }
        return empty;
    }
}