class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] letters = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            int x = queries[i][0];//내가 쓸 2차원 배열의 i행0열 인덱스값
            int y = queries[i][1];
            
            // 양 끝에서 하나씩 교환 while문을 쓰는 것이 더 알맞겠군...
            while(x < y){
                char temp = letters[x];
                letters[x] = letters[y];
                letters[y] = temp;
                x++;
                y--;
            }
        }
        
        return new String(letters); // 배열 latters을 String으로 변환
    }
}
