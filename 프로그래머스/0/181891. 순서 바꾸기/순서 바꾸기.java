import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();

        // n번째 이후 원소 먼저 추가 (n은 1-based 라고 가정)
        for (int i = n; i < num_list.length; i++) {
            result.add(num_list[i]);
        }

        // 그다음 n번째까지의 원소 추가
        for (int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }

        // 리스트 → 배열로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
