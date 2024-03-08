function solution(n) {
    getCount = (num) => {
        const s = num.toString(2);
        let cnt = 0;
        
        for(let i = 0; i < s.length; i++) s[i] === '1' ? cnt++ : '';
        
        return cnt;
    };
    
    const countA = getCount(n);
    
    while(true) {
        const countB = getCount(++n);
        if(countA === countB) return n;
    }
}
