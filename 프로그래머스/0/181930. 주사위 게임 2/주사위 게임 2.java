class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a==b && b==c && c==a){
             answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c);
        }else if(a==b || b==c || c==a){
            answer =  (a + b + c) * (a*a + b*b + c*c );
        }else{
            answer = a + b + c;
        }
        return answer;
    }
}

//또다른 풀이(재귀함수를 이용해서 제곱부분을 함수화)
class Solution{
    public int solution(int a, int b, int c){
        int answer = 1;
        int count =1
        if(a==b && b==c){
            count++;
        }
        if(a==b || b==a || c==a){
            count++;
        }

        for(int i=1; i<=count; i++){
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }

        return answer;
    }

    private int pow(int a, int b){
        if(b == 0){
            retunr 1;
        }
        return a * pow(a, b-1);
    }
}
