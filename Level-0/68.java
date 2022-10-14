class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = chicken;
        int s_chicken = 0;
        int s_coupon = 0;
        while(true){
            s_chicken += coupon / 10;
            s_coupon += coupon % 10;
            coupon /= 10;
            if(coupon == 0 && s_coupon >= 10){
                coupon = s_coupon;
                s_coupon = 0;
            }else if(coupon == 0){
                break;
            }
        }
        answer = s_chicken;
        return answer;
    }
}
