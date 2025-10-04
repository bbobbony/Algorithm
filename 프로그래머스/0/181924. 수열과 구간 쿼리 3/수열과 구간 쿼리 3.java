class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            //각각 해당 원소만 arr배열에서 바꿔주는 거니까 고정적으로 사용해도 Ok
            int a = queries[i][0]; // 교환할 첫 번째 인덱스
            int b = queries[i][1]; // 교환할 두 번째 인덱스
            
            // 바꿔주기
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
}
