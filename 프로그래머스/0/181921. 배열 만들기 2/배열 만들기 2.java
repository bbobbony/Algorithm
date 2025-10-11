class Solution {
    public int[] solution(int l, int r) {
        java.util.List<Integer> list = new java.util.ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);  // 숫자를 문자열로 변환
            boolean ok = true;

            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') { // 0과 5가 아닌 숫자가 있으면
                    ok = false;
                    break;
                }
            }

            if (ok) list.add(i); // 조건 만족하면 추가
        }

        if (list.isEmpty()) {
            return new int[] {-1};
        }

        // List<Integer> → int[]
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
