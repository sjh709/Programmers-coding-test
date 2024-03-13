function solution(begin, end) {
    const arr = new Array(end - begin + 1).fill(0);
    
    const getMaxDivisor = (n) => {
        const checkArr = [];
        
        if(n === 1) return 0;
        
        for(let i = 2; i <= Math.sqrt(n); i++) {
            if(n % i === 0) {
                checkArr.push(i);
                if(n / i <= 1e7) {
                    return n / i;
                }
            }
        }
        
        if(checkArr.length) return checkArr[checkArr.length - 1];
        
        return 1;
    };
    
    for(let i = begin; i <= end; i++) {
        arr[i - begin] = getMaxDivisor(i);
    }
    
    return arr;
}
