function solution(nums) {
    let answer = [];
    
    for(let i = 0; i < nums.length - 2; i++) {
        for(let j = i + 1; j < nums.length - 1; j++) {
            for(let k = j + 1; k < nums.length; k++) {
                answer.push(nums[i] + nums[j] + nums[k]);
            }
        }
    }
    
    let cnt = 0;
    for(let i = 0; i < answer.length; i++) {
        const n = answer[i];
        for(let j = 2; j <= Math.sqrt(n); j++) {
            if(n % j === 0) {
                cnt++;
                break;
            }
        }
    }
    
    return answer.length - cnt;
}
