function check(n) {
    for(let i = 2; i <= Math.sqrt(n); i++) {
        if(n % i === 0) return false;
    }
    
    return true;
}

function solution(nums) {
    let cnt = 0
    
    for(let i = 0; i < nums.length - 2; i++) {
        for(let j = i + 1; j < nums.length - 1; j++) {
            for(let k = j + 1; k < nums.length; k++) {
                check(nums[i] + nums[j] + nums[k]) ? cnt++ : '';
            }
        }
    }
    
    return cnt;
}
