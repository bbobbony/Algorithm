import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int arr[] = {a, b, c, d};
        Arrays.sort(arr);
        
        //4개 동일한 경우
        if(arr[0]==arr[3]) return 1111* arr[0];
        //3개 동일한 경우 + pow(n,3)  n의 세제곱을 계산 + double값을 반환
        if(arr[0]==arr[2]) return (int)Math.pow(10*arr[0] + arr[3],2); //앞에 3개 동일
        if(arr[1]==arr[3]) return (int)Math.pow(10*arr[1] + arr[0],2);//뒤에 3개 동일
        //2개 + 2개 동일한 경우
        if(arr[0]==arr[1] && arr[2]==arr[3]) return (arr[0]+arr[2])*Math.abs(arr[0]-arr[2]);
        //2개만 같은 경우
        if(arr[0]==arr[1]) return arr[2] * arr[3];
        if(arr[1]==arr[2]) return arr[0] * arr[3];
        if(arr[2]==arr[3]) return arr[0] * arr[1];
        //같은 수가 없는 경우
        return arr[0];
    }
}
