function solution(n, times) {
    times.sort((a, b) => a - b);
    let start = 1;
    let end = n * times[times.length - 1];
    
    while(start <= end) {
        const mid = Math.floor((start + end) / 2);
        const sum = times.reduce((acc, cur) => acc + Math.floor(mid / cur), 0);
        
        if(sum < n) {
            start = mid + 1;
        }else {
            end = mid - 1;
        }
    }
    
    return start;
}
