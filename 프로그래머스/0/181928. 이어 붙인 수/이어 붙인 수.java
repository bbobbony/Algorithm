//리스트가 주어진다. return "홀수"+"홀수" + "짝수"+"짝수"

class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        int answer = 0;
        
        for(int i =0; i< num_list.length; i++){ //list의 개수만큼 반복
            if(num_list[i] % 2 == 0){ //짝수라면
                even += num_list[i]; 
            }else{ //홀수라면
                odd += num_list[i];
            }
        }
        
        answer = Integer.parseInt(even) +Integer.parseInt(odd);
        return answer;
    }
}