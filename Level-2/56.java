class Solution {
    public long solution(int w, int h) {
        long answer = w;
        
        int wt = w;
        int ht = h;
        
        while(ht != 0) {
            int r = wt % ht;
            wt = ht;
            ht = r;
        }
        
        //answer = (long)w * h - ((w / wt) + (h / wt) - 1) * wt;
        answer *= h;
        answer -= w + h - wt;
        
        return answer;
    }
}
